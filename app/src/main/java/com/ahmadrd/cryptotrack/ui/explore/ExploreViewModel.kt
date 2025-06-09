package com.ahmadrd.cryptotrack.ui.explore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmadrd.cryptotrack.data.remote.response.NewsTypeTrendingItem
import com.ahmadrd.cryptotrack.di.Repository
import com.ahmadrd.cryptotrack.ui.utils.Result
import kotlinx.coroutines.launch

class ExploreViewModel(private val repository: Repository): ViewModel() {

    private val _newsResult = MutableLiveData<Result<List<NewsTypeTrendingItem?>>>()
    val newsResult: LiveData<Result<List<NewsTypeTrendingItem?>>> = _newsResult

    init {
        getNews()
    }

    private fun getNews() {
        viewModelScope.launch {
            _newsResult.value = Result.Loading
            try {
                val response = repository.getNews()
                _newsResult.value = Result.Success(response)
            } catch (e: Exception) {
                _newsResult.value = Result.Error(e.message ?: "Something went wrong.")
            }
        }
    }

}