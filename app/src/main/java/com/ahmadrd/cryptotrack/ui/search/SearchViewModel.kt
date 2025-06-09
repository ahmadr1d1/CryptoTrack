package com.ahmadrd.cryptotrack.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmadrd.cryptotrack.data.remote.response.MarketResponse
import com.ahmadrd.cryptotrack.di.Repository
import com.ahmadrd.cryptotrack.ui.utils.Result
import kotlinx.coroutines.launch
import retrofit2.HttpException

class SearchViewModel(private val repository: Repository) : ViewModel() {

    private val _coinResult = MutableLiveData<Result<List<MarketResponse>>>()
    val coinResult: LiveData<Result<List<MarketResponse>>> = _coinResult

    fun searchCoins(query: String) {
        viewModelScope.launch {
            _coinResult.value = Result.Loading
            try {
                val searchResult = repository.searchCoinsItem(query)
                val ids = searchResult.mapNotNull { it?.id }.joinToString(",")
                val fullData = repository.getCoinsMarketsByIds(ids)
                _coinResult.value = Result.Success(fullData)
            } catch (e: HttpException) {
                val messageLimit = if (e.code() == 429) {
                    "Too many requests. Please try again later."
                } else {
                    "Failed load data: ${e.message()}"
                }
                _coinResult.value = Result.Error(messageLimit)
            }  catch (e: Exception) {
                _coinResult.value = Result.Error(e.message ?: "Something went wrong.")
            }
        }
    }


    init {
        getCoins()
    }

     fun getCoins() {
        viewModelScope.launch {
            _coinResult.value = Result.Loading
            try {
                val response = repository.getCoinsSearch()
                val mappedList = response.map {
                    MarketResponse(
                        id = it.id ?: "",
                        name = it.name ?: "",
                        symbol = it.symbol ?: "",
                        image = it.image ?: "",
                        currentPrice = it.currentPrice ?: 0.0,
                        priceChangePercentage7dInCurrency = it.priceChangePercentage7dInCurrency ?: 0.0,
                        marketCap = null,
                        marketCapRank = it.marketCapRank,
                        sparkline = null
                    )
                }
                _coinResult.value = Result.Success(mappedList)
            } catch (e: HttpException) {
                val messageLimit = if (e.code() == 429) {
                    "Too many requests. Please try again later."
                } else {
                    "Failed load data: ${e.message()}"
                }
                _coinResult.value = Result.Error(messageLimit)
            } catch (e: Exception) {
                _coinResult.value = Result.Error(e.message ?: "Something went wrong.")
            }
        }
    }
}
