package com.ahmadrd.cryptotrack.ui.detail

import android.app.Application
import android.util.Log
import androidx.core.content.edit
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ahmadrd.cryptotrack.data.remote.response.DetailCoinsResponse
import com.ahmadrd.cryptotrack.data.remote.response.HistoryChartResponse
import com.ahmadrd.cryptotrack.di.Repository
import com.ahmadrd.cryptotrack.ui.utils.Result
import com.ahmadrd.cryptotrack.ui.utils.UiEvent
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.HttpException

class DetailViewModel(application: Application, private val repository: Repository) :
    AndroidViewModel(application) {


    // Untuk data detail koin
    private val _detailCoins = MutableLiveData<Result<DetailCoinsResponse>>()
    val detailCoins: LiveData<Result<DetailCoinsResponse>> = _detailCoins

    // Untuk data history chart (daftar harga)
    private val _historyChart = MutableLiveData<Result<HistoryChartResponse>>()
    val historyChart: LiveData<Result<HistoryChartResponse>> = _historyChart

    // Untuk menyimpan periode chart yang sedang dipilih (misalnya "1", "7", "30", "365")
    // Default 7 hari mengikuti sparkline home
    private val _currentSelectedPeriodDays = MutableLiveData("7")
    val currentSelectedPeriodDays: LiveData<String> = _currentSelectedPeriodDays

    // LiveData untuk mengirim event ke UI (misalnya untuk Toast error)
    private val _uiEvent = MutableLiveData<UiEvent>()
    val uiEvent: LiveData<UiEvent> = _uiEvent

    // Cache agar tidak terkena limit request API saat user mengubah periode chart
    private val chartCache = mutableMapOf<Pair<String, String>, HistoryChartResponse>()

    // Delay countdown(1 menit) setiap membuka halaman detail kedua kalinya
    // Agar tidak terkena limit request API
    private var lastDetailCoinsFetchTime: Long = 0L
    private val prefs =
        application.getSharedPreferences("crypto_pref", android.content.Context.MODE_PRIVATE)

    private var lastChartFetchTime: Long = 0L
    init {
        lastDetailCoinsFetchTime = prefs.getLong("last_fetch_time", 0L)
    }

    private val _remainingTimeToFetch = MutableLiveData<Long>() // dalam millis
    val remainingTimeToFetch: LiveData<Long> = _remainingTimeToFetch

    private var countdownJob: Job? = null

    private fun startCountdown() {
        countdownJob?.cancel()
        countdownJob = viewModelScope.launch {
            while (_remainingTimeToFetch.value != null && _remainingTimeToFetch.value!! > 0) {
                delay(1000)
                val newTime = _remainingTimeToFetch.value!! - 1000
                _remainingTimeToFetch.postValue(newTime)
            }
        }
    }

    fun getDetailCoins(id: String) {

        val now = System.currentTimeMillis()
        val timeSinceLastFetch = now - lastDetailCoinsFetchTime
        val timeLimit = 60_000L

        if (lastDetailCoinsFetchTime > 0L && timeSinceLastFetch < timeLimit) {
            val remainingTime = timeLimit - timeSinceLastFetch
            _remainingTimeToFetch.value = remainingTime
            startCountdown()
            return // Jangan fetch ke API
        }

        viewModelScope.launch {
            _detailCoins.value = Result.Loading
            try {
                val response = repository.getDetailCoins(id)
                _detailCoins.value = Result.Success(response)
                lastDetailCoinsFetchTime =
                    System.currentTimeMillis() // Update waktu terakhir sukses
                prefs.edit { putLong("last_fetch_time", lastDetailCoinsFetchTime) }
            } catch (e: HttpException) {
                val errorMessage = if (e.code() == 429) {
                    "Too many requests. Please try again later."
                } else {
                    "Failed load data detailCoins: ${e.message()}"
                }
                _detailCoins.value = Result.Error(errorMessage)
                _uiEvent.value = UiEvent.ShowToast(errorMessage)
                Log.e(
                    "DetailViewModel",
                    "HttpException fetching detail coins: ${e.code()} - ${e.message()}"
                )
            } catch (e: Exception) {
                val errorMessage = e.message ?: "An error occurred while loading details"
                _detailCoins.value = Result.Error(errorMessage)
                _uiEvent.value = UiEvent.ShowToast(errorMessage)
                Log.e("DetailViewModel", "Error fetching detail coins: ${e.message}", e)
            }
        }

        // DEBUG ONLY - helps trace malformed JSON from CoinGecko
        /**
         * if (BuildConfig.DEBUG) {
         *             viewModelScope.launch {
         *                 try {
         *                     val rawJson = repository.getRawDetailCoins(id).string()
         *                     val obj = JSONObject(rawJson)
         *                     Log.e("RAW_JSON_DEBUG", "Raw response for $id: $obj")
         *                 } catch (e: Exception) {
         *                     Log.e("RAW_JSON_DEBUG", "Error fetching raw data for $id: ${e.message}", e)
         *                 }
         *             }
         *         }
         */

    }

    /**
     * Mengambil data market chart untuk ID koin dan periode hari yang ditentukan.
     */
    fun getMarketChart(id: String, days: String) {

        // Cooldown clickable other period "24h" "7d" "1y" etc
        val now = System.currentTimeMillis()
        val timeSinceChartFetch = now - lastChartFetchTime
        val chartCooldown = 2000L // delay 2s
        if (timeSinceChartFetch < chartCooldown) {
            _uiEvent.value = UiEvent.ShowToast("Please wait 2 seconds before click again")
            return
        }


        viewModelScope.launch {
            val cacheKey = id to days
            if (chartCache.containsKey(cacheKey)) {
                _historyChart.value = Result.Success(chartCache[cacheKey]!!)
                return@launch // Hentikan eksekusi lebih lanjut karena data dari cache
            }
            _historyChart.value = Result.Loading
            try {
                val response = repository.getMarketChart(id, days)
                _historyChart.value = Result.Success(response)
                chartCache[cacheKey] = response // Simpan ke cache
                _historyChart.value = Result.Success(response)
                lastChartFetchTime = System.currentTimeMillis()
                prefs.edit { putLong("last_fetch_time", lastDetailCoinsFetchTime) }
            } catch (e: HttpException) {
                val errorMessage = if (e.code() == 429) {
                    "Too many Chart requests. Please try again later."
                } else {
                    "Failed load data chart: ${e.message()}"
                }
                _historyChart.value = Result.Error(errorMessage)
                _uiEvent.value = UiEvent.ShowToast(errorMessage)
                Log.e(
                    "DetailViewModel",
                    "HttpException fetching market chart: ${e.code()} - ${e.message()}"
                )
            } catch (e: Exception) {
                val errorMessage = e.message ?: "Terjadi kesalahan saat memuat chart"
                _historyChart.value = Result.Error(errorMessage)
                _uiEvent.value = UiEvent.ShowToast(errorMessage)
                Log.e("DetailViewModel", "Error fetching market chart: ${e.message}", e)
            }
        }
    }

    /**
     * Dipanggil dari UI (Fragment Overview) ketika pengguna mengubah periode chart.
     * Ini akan memperbarui LiveData periode dan memicu pengambilan ulang data chart.
     */
    fun updateChartPeriod(coinId: String, newDaysPeriod: String) {
        // Hanya muat ulang jika periode benar-benar berubah untuk menghindari call yang tidak perlu
        if (_currentSelectedPeriodDays.value != newDaysPeriod) {
            _currentSelectedPeriodDays.value = newDaysPeriod
            getMarketChart(coinId, newDaysPeriod)
        } else {
            // Jika periode sama, tapi mungkin chart belum ada data (misal karena error sebelumnya),
            // Click button = Refresh
            if (_historyChart.value is Result.Error || _historyChart.value is Result.Loading
                || _historyChart.value == null) {
                getMarketChart(coinId, newDaysPeriod)
            }
        }
    }

    /**
     * Fungsi helper untuk mendapatkan data persentase perubahan yang relevan dari
     * DetailCoinsResponse berdasarkan periode chart yang sedang aktif.
     */
    fun getChangePercentageForCurrentPeriod(
        detailData: DetailCoinsResponse?,
        currentDays: String?
    ): Double? {
        if (detailData?.marketData == null || currentDays == null) {
            return null // Atau 0.0 jika ingin default hijau saat data tidak ada
        }

        val percentage = when (currentDays) {
            "1" -> detailData.marketData.priceChangePercentage24hInCurrency?.usd
            "7" -> detailData.marketData.priceChangePercentage7dInCurrency?.usd
            "14" -> detailData.marketData.priceChangePercentage14dInCurrency?.usd
            "30" -> detailData.marketData.priceChangePercentage30dInCurrency?.usd
            "365", "1y" -> detailData.marketData.priceChangePercentage1yInCurrency?.usd
            else -> detailData.marketData.priceChangePercentage7dInCurrency?.usd // Default ke 7d
        }
        return percentage
    }

}