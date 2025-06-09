package com.ahmadrd.cryptotrack.data.remote.response

import com.google.gson.annotations.SerializedName

data class SearchResponse(

	@field:SerializedName("nfts")
	val nfts: List<NftsItem?>? = null,

	@field:SerializedName("coins")
	val coins: List<CoinsItem?>? = null,

	@field:SerializedName("exchanges")
	val exchanges: List<ExchangesItem?>? = null,

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null,

	@field:SerializedName("icos")
	val icos: List<Any?>? = null
)

data class NftsItem(

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("thumb")
	val thumb: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)

data class CategoriesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)

data class CoinsItem(

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("api_symbol")
	val apiSymbol: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("thumb")
	val thumb: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("market_cap_rank")
	val marketCapRank: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("price_change_percentage_24h")
	val priceChangePercentage24h: Double? = null,

	@field:SerializedName("current_price")
	val currentPrice: Double? = null,

	@field:SerializedName("price_change_percentage_7d_in_currency")
	val priceChangePercentage7dInCurrency: Double? = null,
)

data class ExchangesItem(

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("thumb")
	val thumb: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("market_type")
	val marketType: String? = null
)
