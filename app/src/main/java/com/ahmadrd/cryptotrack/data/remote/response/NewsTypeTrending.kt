package com.ahmadrd.cryptotrack.data.remote.response

import com.google.gson.annotations.SerializedName

//data class NewsTypeTrending(
//
//	@field:SerializedName("NewsTypeTrending")
//	val newsTypeTrending: List<NewsTypeTrendingItem?>? = null
//)

data class ReactionsCount(
	val any: Any? = null
)

//data class CoinsItemNews(
//
//	@field:SerializedName("coinKeyWords")
//	val coinKeyWords: String? = null,
//
//	@field:SerializedName("coinNameKeyWords")
//	val coinNameKeyWords: String? = null,
//
//	@field:SerializedName("coinPercent")
//	val coinPercent: Any? = null,
//
//	@field:SerializedName("coinTitleKeyWords")
//	val coinTitleKeyWords: String? = null,
//
//	@field:SerializedName("coinIdKeyWords")
//	val coinIdKeyWords: String? = null
//)

data class NewsTypeTrendingItem(

	@field:SerializedName("feedDate")
	val feedDate: Long? = null,

	@field:SerializedName("reactionsCount")
	val reactionsCount: ReactionsCount? = null,

	@field:SerializedName("coins")
	val coins: List<Any?>? = null,

	@field:SerializedName("searchKeyWords")
	val searchKeyWords: List<Any?>? = null,

	@field:SerializedName("sourceLink")
	val sourceLink: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("content")
	val content: Boolean? = null,

	@field:SerializedName("imgUrl")
	val imgUrl: String? = null,

	@field:SerializedName("relatedCoins")
	val relatedCoins: List<Any?>? = null,

	@field:SerializedName("bigImg")
	val bigImg: Boolean? = null,

	@field:SerializedName("reactions")
	val reactions: List<Any?>? = null,

	@field:SerializedName("shareURL")
	val shareURL: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("isFeatured")
	val isFeatured: Boolean? = null
)
