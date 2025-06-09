package com.ahmadrd.cryptotrack.data.remote.response

import com.google.gson.annotations.SerializedName

data class HistoryChartResponse(

	@field:SerializedName("total_volumes")
	val totalVolumes: List<List<Double?>?>? = null,

	@field:SerializedName("prices")
	val prices: List<List<Double>>,

	@field:SerializedName("market_caps")
	val marketCaps: List<List<Double?>?>? = null
)
