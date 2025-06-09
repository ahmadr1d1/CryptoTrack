package com.ahmadrd.cryptotrack.data.remote.retrofit

import com.ahmadrd.cryptotrack.data.remote.response.CoinsItem
import com.ahmadrd.cryptotrack.data.remote.response.DetailCoinsResponse
import com.ahmadrd.cryptotrack.data.remote.response.HistoryChartResponse
import com.ahmadrd.cryptotrack.data.remote.response.MarketResponse
import com.ahmadrd.cryptotrack.data.remote.response.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface  ApiService {

    @GET("coins/markets")
    suspend fun getCoins(
        @Query("vs_currency") vsCurrency: String,
        @Query("sparkline") sparkline: Boolean = true,
        @Query("per_page") perPage: Int = 25,
        @Query("price_change_percentage") priceChangePercentage: String
    ): List<MarketResponse>

    @GET("search")
    suspend fun search(
        @Query("query") query: String
    ): SearchResponse

    @GET("coins/markets")
    suspend fun getCoinsSearch(
        @Query("vs_currency") vsCurrency: String = "usd",
        @Query("per_page") perPage: Int = 25,
        @Query("price_change_percentage") priceChangePercentage: String
    ): List<CoinsItem>

    @GET("coins/markets")
    suspend fun getCoinsMarketsByIds(
        @Query("vs_currency") vsCurrency: String = "usd",
        @Query("ids") ids: String,
        @Query("price_change_percentage") priceChangePercentage: String,
        @Query("per_page") perPage: Int = 25
    ): List<MarketResponse>

    @GET("coins/{id}")
    suspend fun getDetailCoins(
        @Path("id") id: String
    ): DetailCoinsResponse

    @GET("coins/{id}/market_chart")
    suspend fun getMarketChart(
        @Path("id") id: String,
        @Query("vs_currency") vsCurrency: String = "usd",
        @Query("days") days: String
    ): HistoryChartResponse

    /**
     * DEBUG ONLY - helps trace malformed JSON from CoinGecko
     * @GET("coins/{id}")
     *     suspend fun getRawDetailCoins(
     *         @Path("id") id: String
     *     ): ResponseBody
     */

}