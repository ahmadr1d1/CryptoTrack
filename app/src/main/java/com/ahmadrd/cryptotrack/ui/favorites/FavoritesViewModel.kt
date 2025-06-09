package com.ahmadrd.cryptotrack.ui.favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmadrd.cryptotrack.data.local.entity.FavoritesCoin
import com.ahmadrd.cryptotrack.di.Repository
import kotlinx.coroutines.launch

/**
 * Kode yang diberi komentar diperuntukkan untuk
 * kemudahan dalam mengembangkan halaman favorites News
 * Di masa mendatang.
 */
class FavoritesViewModel(private val repository: Repository) : ViewModel() {

    fun getFavCoin(): LiveData<List<FavoritesCoin>> = repository.getFavCoins()
//    fun getFavNews(): LiveData<List<FavoritesNews>> = repository.getFavNews()

    fun insertCoin(favorite: FavoritesCoin) {
        viewModelScope.launch {
            repository.insertFavCoin(favorite)
        }
    }
//    fun insertNews(favorite: FavoritesNews) {
//        viewModelScope.launch {
//            repository.insertFavNews(favorite)
//        }
//    }

    fun isCoinFavorited(coinId: String): LiveData<List<FavoritesCoin>> =
        repository.isCoinFavorited(coinId)
//    fun isNewsFavorite(newsId: Int): LiveData<List<FavoritesNews>> =
//        repository.isNewsFavorite(newsId)

    fun deleteCoin(favCoin: FavoritesCoin) {
        viewModelScope.launch {
            repository.deleteFavCoin(favCoin)
        }
    }
//    fun deleteNews(favNews: FavoritesNews) {
//        viewModelScope.launch {
//            repository.deleteFavNews(favNews)
//        }
//    }
}