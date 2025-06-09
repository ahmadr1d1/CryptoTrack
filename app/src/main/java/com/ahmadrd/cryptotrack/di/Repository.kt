package com.ahmadrd.cryptotrack.di

import androidx.lifecycle.LiveData
import com.ahmadrd.cryptotrack.BuildConfig
import com.ahmadrd.cryptotrack.data.local.entity.FavoritesCoin
import com.ahmadrd.cryptotrack.data.local.room.FavoritesCoinDao
import com.ahmadrd.cryptotrack.data.remote.response.CoinsItem
import com.ahmadrd.cryptotrack.data.remote.response.DetailCoinsResponse
import com.ahmadrd.cryptotrack.data.remote.response.HistoryChartResponse
import com.ahmadrd.cryptotrack.data.remote.response.MarketResponse
import com.ahmadrd.cryptotrack.data.remote.response.NewsTypeTrendingItem
import com.ahmadrd.cryptotrack.data.remote.retrofit.ApiService
import com.ahmadrd.cryptotrack.data.remote.retrofit.NewsApiService


/**
 * Kode yang diberi komentar diperuntukkan untuk
 * kemudahan dalam mengembangkan halaman favorites News
 * Di masa mendatang.
 */
class Repository(
    private val apiService: ApiService,
    private val newsApiService: NewsApiService,
    private val favoritesCoinDao: FavoritesCoinDao,
//    private val favoritesNewsDao: FavoritesNewsDao
) {
    suspend fun getCoinMarkets(): List<MarketResponse> {
        return apiService.getCoins("usd", priceChangePercentage = "7d")
    }

    suspend fun getCoinsSearch(): List<CoinsItem> {
        return apiService.getCoinsSearch(priceChangePercentage = "7d")
    }

    suspend fun searchCoinsItem(query: String): List<CoinsItem?> {
        return apiService.search(query).coins ?: emptyList()
    }

    suspend fun getCoinsMarketsByIds(ids: String): List<MarketResponse> {
        return apiService.getCoinsMarketsByIds(ids = ids, priceChangePercentage = "7d")
    }

    suspend fun getNews(): List<NewsTypeTrendingItem?> {
        return newsApiService.
        getTrendingNews(BuildConfig.API_KEY_COINSTATS)
    }

    suspend fun getDetailCoins(id: String): DetailCoinsResponse {
        return apiService.getDetailCoins(id)
    }

    suspend fun getMarketChart(id: String, days: String): HistoryChartResponse {
        return apiService.getMarketChart(id, days = days)
    }

    /**
     * DEBUG ONLY - helps trace malformed JSON from CoinGecko
     *     suspend fun getRawDetailCoins(id: String): ResponseBody {
     *         return apiService.getRawDetailCoins(id)
     *     }
     */


    fun getFavCoins(): LiveData<List<FavoritesCoin>> = favoritesCoinDao.getFavCoin()
    fun isCoinFavorited(coinsId: String): LiveData<List<FavoritesCoin>> =
        favoritesCoinDao.getFavCoinById(coinsId)

    suspend fun insertFavCoin(favCoin: FavoritesCoin) = favoritesCoinDao.insertFavCoin(favCoin)
    suspend fun deleteFavCoin(favCoin: FavoritesCoin) = favoritesCoinDao.deleteFavCoin(favCoin)

//    fun getFavNews(): LiveData<List<FavoritesNews>> = favoritesNewsDao.getFavNews()
//    fun isNewsFavorite(newsId: Int): LiveData<List<FavoritesNews>> =
//        favoritesNewsDao.getFavNewsById(newsId)

//    suspend fun insertFavNews(favNews: FavoritesNews) = favoritesNewsDao.insertFavNews(favNews)
//    suspend fun deleteFavNews(favNews: FavoritesNews) = favoritesNewsDao.deleteFavNews(favNews)

    companion object {
        @Volatile
        private var instance: Repository? = null

        fun getInstance(
            apiService: ApiService,
            newsApiService: NewsApiService,
            favoritesCoinDao: FavoritesCoinDao,
//            favoritesNewsDao: FavoritesNewsDao
        ): Repository = instance ?: synchronized(this) {
            instance ?: Repository(apiService, newsApiService, favoritesCoinDao)
//            instance ?: Repository(apiService, newsApiService, favoritesCoinDao, favoritesNewsDao)
        }.also { instance = it }
    }

}
