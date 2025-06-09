package com.ahmadrd.cryptotrack.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmadrd.cryptotrack.data.remote.response.MarketResponse
import com.ahmadrd.cryptotrack.di.Repository
import com.ahmadrd.cryptotrack.ui.utils.Result
import kotlinx.coroutines.launch
import retrofit2.HttpException

class HomeViewModel(private val repository: Repository) : ViewModel() {

    private val _coinResult = MutableLiveData<Result<List<MarketResponse>>>()
    val coinResult: LiveData<Result<List<MarketResponse>>> = _coinResult

    init {
        getCoins()
    }

    private fun getCoins() {
        viewModelScope.launch {
            _coinResult.value = Result.Loading
            try {
                val response = repository.getCoinMarkets()
                _coinResult.value = Result.Success(response)
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


