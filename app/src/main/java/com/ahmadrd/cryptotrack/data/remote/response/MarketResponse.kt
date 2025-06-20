package com.ahmadrd.cryptotrack.data.remote.response

import com.google.gson.annotations.SerializedName

data class MarketResponse(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("current_price")
	val currentPrice: Double? = null,

	@field:SerializedName("market_cap")
	val marketCap: Double? = null,

	@field:SerializedName("market_cap_rank")
	val marketCapRank: Int? = null,

	@field:SerializedName("fully_diluted_valuation")
	val fullyDilutedValuation: Double? = null,

	@field:SerializedName("total_volume")
	val totalVolume: Double? = null,

	@field:SerializedName("high_24h")
	val high24h: Double? = null,

	@field:SerializedName("low_24h")
	val low24h: Double? = null,

	@field:SerializedName("price_change_24h")
	val priceChange24h: Double? = null,

	@field:SerializedName("price_change_percentage_24h")
	val priceChangePercentage24h: Double? = null,

	@field:SerializedName("market_cap_change_24h")
	val marketCapChange24h: Double? = null,

	@field:SerializedName("market_cap_change_percentage_24h")
	val marketCapChangePercentage24h: Double? = null,

	@field:SerializedName("circulating_supply")
	val circulatingSupply: Double? = null,

	@field:SerializedName("total_supply")
	val totalSupply: Double? = null,

	@field:SerializedName("max_supply")
	val maxSupply: Double? = null,

	@field:SerializedName("ath")
	val ath: Double? = null,

	@field:SerializedName("ath_change_percentage")
	val athChangePercentage: Double? = null,

	@field:SerializedName("ath_date")
	val athDate: String? = null,

	@field:SerializedName("atl")
	val atl: Double? = null,

	@field:SerializedName("atl_change_percentage")
	val atlChangePercentage: Double? = null,

	@field:SerializedName("atl_date")
	val atlDate: String? = null,

	@field:SerializedName("roi")
	val roi: Roi? = null,

	@field:SerializedName("last_updated")
	val lastUpdated: String? = null,

	@field:SerializedName("sparkline_in_7d")
	val sparkline: Sparkline? = null,

	@field:SerializedName("price_change_percentage_7d_in_currency")
	val priceChangePercentage7dInCurrency: Double? = null,
)

data class Roi(

	@field:SerializedName("times")
	val times: Double? = null,

	@field:SerializedName("percentage")
	val percentage: Double? = null,

	@field:SerializedName("currency")
	val currency: String? = null
)

data class Sparkline(

	@field:SerializedName("price")
	val price: List<Double>? = null
)
