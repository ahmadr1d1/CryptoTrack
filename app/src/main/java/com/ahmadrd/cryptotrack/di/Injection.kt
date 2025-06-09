package com.ahmadrd.cryptotrack.di

import android.content.Context
import com.ahmadrd.cryptotrack.data.local.room.FavoritesCoinDao
import com.ahmadrd.cryptotrack.data.local.room.FavoritesDatabase
import com.ahmadrd.cryptotrack.data.remote.retrofit.ApiConfig
import com.ahmadrd.cryptotrack.data.remote.retrofit.ApiService
import com.ahmadrd.cryptotrack.data.remote.retrofit.NewsApiConfig
import com.ahmadrd.cryptotrack.data.remote.retrofit.NewsApiService

/**
 * Using manual Injection
 */
object Injection {

    private fun provideCoinApiService(): ApiService {
        return ApiConfig.getApiService()
    }

    private fun provideNewsApiService(): NewsApiService {
        return NewsApiConfig.apiService
    }

    private fun provideDatabase(context: Context): FavoritesDatabase =
        FavoritesDatabase.getInstance(context)

    private fun provideCoinDao(context: Context): FavoritesCoinDao =
        provideDatabase(context).favoritesCoinDao()

//    private fun provideNewsDao(context: Context): FavoritesNewsDao =
//        provideDatabase(context).favoritesNewsDao()

    fun provideRepository(context: Context): Repository {
        return Repository.getInstance(
            apiService = provideCoinApiService(),
            newsApiService = provideNewsApiService(),
            favoritesCoinDao = provideCoinDao(context),
//            favoritesNewsDao = provideNewsDao(context)
        )
    }
}