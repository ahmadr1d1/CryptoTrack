package com.ahmadrd.cryptotrack.data.remote.retrofit

import com.ahmadrd.cryptotrack.data.remote.response.NewsTypeTrendingItem
import retrofit2.http.GET
import retrofit2.http.Header

interface NewsApiService {
    @GET("news/type/trending")
    suspend fun getTrendingNews(
        @Header("X-API-KEY") apiKey: String
    ): List<NewsTypeTrendingItem>

}