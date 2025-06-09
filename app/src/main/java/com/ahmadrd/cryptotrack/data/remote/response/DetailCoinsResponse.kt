@file:Suppress("unused", "unused", "unused", "unused", "unused")

package com.ahmadrd.cryptotrack.data.remote.response

import com.google.gson.annotations.SerializedName

data class DetailCoinsResponse(

	@field:SerializedName("localization")
	val localization: Localization? = null,

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("sentiment_votes_up_percentage")
	val sentimentVotesUpPercentage: Double? = null,

	@field:SerializedName("asset_platform_id")
	val assetPlatformId: String? = null,

	@field:SerializedName("public_notice")
	val publicNotice: String? = null,

	@field:SerializedName("description")
	val description: Description? = null,

	@field:SerializedName("market_cap_rank")
	val marketCapRank: Double? = null,

	@field:SerializedName("detail_platforms")
	val detailPlatforms: DetailPlatforms? = null,

	@field:SerializedName("watchlist_portfolio_users")
	val watchlistPortfolioUsers: Double? = null,

	// Penyebab error blank data
//	@field:SerializedName("tickers")
//	val tickers: List<TickersItem?>? = null,

	@field:SerializedName("platforms")
	val platforms: Platforms? = null,

	@field:SerializedName("sentiment_votes_down_percentage")
	val sentimentVotesDownPercentage: Double? = null,

	@field:SerializedName("additional_notices")
	val additionalNotices: List<Any?>? = null,

	@field:SerializedName("preview_listing")
	val previewListing: Boolean? = null,

	@field:SerializedName("web_slug")
	val webSlug: String? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("categories")
	val categories: List<String?>? = null,

	@field:SerializedName("genesis_date")
	val genesisDate: String? = null,

	@field:SerializedName("developer_data")
	val developerData: DeveloperData? = null,

	@field:SerializedName("image")
	val image: Image? = null,

	@field:SerializedName("last_updated")
	val lastUpdated: String? = null,

	@field:SerializedName("community_data")
	val communityData: CommunityData? = null,

	@field:SerializedName("country_origin")
	val countryOrigin: String? = null,

	@field:SerializedName("status_updates")
	val statusUpdates: List<Any?>? = null,

	@field:SerializedName("market_data")
	val marketData: MarketData? = null,

	@field:SerializedName("block_time_in_minutes")
	val blockTimeInMinutes: Double? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("hashing_algorithm")
	val hashingAlgorithm: String? = null
)

data class PriceChange24hInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class PriceChangePercentage30dInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class MarketCapChangePercentage24hInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class CodeAdditionsDeletions4Weeks(

	@field:SerializedName("additions")
	val additions: Double? = null,

	@field:SerializedName("deletions")
	val deletions: Double? = null
)

data class TotalVolume(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class PriceChangePercentage200dInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class AthDate(

	@field:SerializedName("usd")
	val usd: String? = null,

	@field:SerializedName("xdr")
	val xdr: String? = null,

	@field:SerializedName("eos")
	val eos: String? = null,

	@field:SerializedName("sgd")
	val sgd: String? = null,

	@field:SerializedName("vef")
	val vef: String? = null,

	@field:SerializedName("bnb")
	val bnb: String? = null,

	@field:SerializedName("eth")
	val eth: String? = null,

	@field:SerializedName("nzd")
	val nzd: String? = null,

	@field:SerializedName("brl")
	val brl: String? = null,

	@field:SerializedName("xag")
	val xag: String? = null,

	@field:SerializedName("chf")
	val chf: String? = null,

	@field:SerializedName("mxn")
	val mxn: String? = null,

	@field:SerializedName("clp")
	val clp: String? = null,

	@field:SerializedName("bits")
	val bits: String? = null,

	@field:SerializedName("zar")
	val zar: String? = null,

	@field:SerializedName("vnd")
	val vnd: String? = null,

	@field:SerializedName("xau")
	val xau: String? = null,

	@field:SerializedName("aud")
	val aud: String? = null,

	@field:SerializedName("ils")
	val ils: String? = null,

	@field:SerializedName("idr")
	val idr: String? = null,

	@field:SerializedName("xrp")
	val xrp: String? = null,

	@field:SerializedName("try")
	val jsonMemberTry: String? = null,

	@field:SerializedName("hkd")
	val hkd: String? = null,

	@field:SerializedName("twd")
	val twd: String? = null,

	@field:SerializedName("aed")
	val aed: String? = null,

	@field:SerializedName("eur")
	val eur: String? = null,

	@field:SerializedName("dkk")
	val dkk: String? = null,

	@field:SerializedName("bch")
	val bch: String? = null,

	@field:SerializedName("cad")
	val cad: String? = null,

	@field:SerializedName("myr")
	val myr: String? = null,

	@field:SerializedName("dot")
	val dot: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("mmk")
	val mmk: String? = null,

	@field:SerializedName("nok")
	val nok: String? = null,

	@field:SerializedName("gel")
	val gel: String? = null,

	@field:SerializedName("btc")
	val btc: String? = null,

	@field:SerializedName("lkr")
	val lkr: String? = null,

	@field:SerializedName("ngn")
	val ngn: String? = null,

	@field:SerializedName("czk")
	val czk: String? = null,

	@field:SerializedName("pkr")
	val pkr: String? = null,

	@field:SerializedName("sek")
	val sek: String? = null,

	@field:SerializedName("ltc")
	val ltc: String? = null,

	@field:SerializedName("uah")
	val uah: String? = null,

	@field:SerializedName("bhd")
	val bhd: String? = null,

	@field:SerializedName("ars")
	val ars: String? = null,

	@field:SerializedName("sar")
	val sar: String? = null,

	@field:SerializedName("inr")
	val inr: String? = null,

	@field:SerializedName("cny")
	val cny: String? = null,

	@field:SerializedName("thb")
	val thb: String? = null,

	@field:SerializedName("krw")
	val krw: String? = null,

	@field:SerializedName("jpy")
	val jpy: String? = null,

	@field:SerializedName("bdt")
	val bdt: String? = null,

	@field:SerializedName("pln")
	val pln: String? = null,

	@field:SerializedName("gbp")
	val gbp: String? = null,

	@field:SerializedName("bmd")
	val bmd: String? = null,

	@field:SerializedName("huf")
	val huf: String? = null,

	@field:SerializedName("xlm")
	val xlm: String? = null,

	@field:SerializedName("sats")
	val sats: String? = null,

	@field:SerializedName("kwd")
	val kwd: String? = null,

	@field:SerializedName("php")
	val php: String? = null,

	@field:SerializedName("yfi")
	val yfi: String? = null,

	@field:SerializedName("rub")
	val rub: String? = null
)

//data class ConvertedVolume(
//
//	@field:SerializedName("btc")
//	val btc: Double? = null,
//
//	@field:SerializedName("usd")
//	val usd: Double? = null,
//
//	@field:SerializedName("eth")
//	val eth: Double? = null
//)

data class PriceChangePercentage24hInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class Low24h(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class CurrentPrice(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class Links(

	@field:SerializedName("subreddit_url")
	val subredditUrl: String? = null,

	@field:SerializedName("official_forum_url")
	val officialForumUrl: List<String?>? = null,

	@field:SerializedName("telegram_channel_identifier")
	val telegramChannelIdentifier: String? = null,

	@field:SerializedName("repos_url")
	val reposUrl: ReposUrl? = null,

	@field:SerializedName("bitcointalk_thread_identifier")
	val bitcointalkThreadIdentifier: Double? = null,

	@field:SerializedName("announcement_url")
	val announcementUrl: List<String?>? = null,

	@field:SerializedName("facebook_username")
	val facebookUsername: String? = null,

	@field:SerializedName("snapshot_url")
	val snapshotUrl: Double? = null,

	@field:SerializedName("blockchain_site")
	val blockchainSite: List<String?>? = null,

	@field:SerializedName("whitepaper")
	val whitepaper: String? = null,

	@field:SerializedName("twitter_screen_name")
	val twitterScreenName: String? = null,

	@field:SerializedName("chat_url")
	val chatUrl: List<String?>? = null,

	@field:SerializedName("homepage")
	val homepage: List<String?>? = null
)

data class AtlDate(

	@field:SerializedName("usd")
	val usd: String? = null,

	@field:SerializedName("xdr")
	val xdr: String? = null,

	@field:SerializedName("eos")
	val eos: String? = null,

	@field:SerializedName("sgd")
	val sgd: String? = null,

	@field:SerializedName("vef")
	val vef: String? = null,

	@field:SerializedName("bnb")
	val bnb: String? = null,

	@field:SerializedName("eth")
	val eth: String? = null,

	@field:SerializedName("nzd")
	val nzd: String? = null,

	@field:SerializedName("brl")
	val brl: String? = null,

	@field:SerializedName("xag")
	val xag: String? = null,

	@field:SerializedName("chf")
	val chf: String? = null,

	@field:SerializedName("mxn")
	val mxn: String? = null,

	@field:SerializedName("clp")
	val clp: String? = null,

	@field:SerializedName("bits")
	val bits: String? = null,

	@field:SerializedName("zar")
	val zar: String? = null,

	@field:SerializedName("vnd")
	val vnd: String? = null,

	@field:SerializedName("xau")
	val xau: String? = null,

	@field:SerializedName("aud")
	val aud: String? = null,

	@field:SerializedName("ils")
	val ils: String? = null,

	@field:SerializedName("idr")
	val idr: String? = null,

	@field:SerializedName("xrp")
	val xrp: String? = null,

	@field:SerializedName("try")
	val jsonMemberTry: String? = null,

	@field:SerializedName("hkd")
	val hkd: String? = null,

	@field:SerializedName("twd")
	val twd: String? = null,

	@field:SerializedName("aed")
	val aed: String? = null,

	@field:SerializedName("eur")
	val eur: String? = null,

	@field:SerializedName("dkk")
	val dkk: String? = null,

	@field:SerializedName("bch")
	val bch: String? = null,

	@field:SerializedName("cad")
	val cad: String? = null,

	@field:SerializedName("myr")
	val myr: String? = null,

	@field:SerializedName("dot")
	val dot: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("mmk")
	val mmk: String? = null,

	@field:SerializedName("nok")
	val nok: String? = null,

	@field:SerializedName("gel")
	val gel: String? = null,

	@field:SerializedName("btc")
	val btc: String? = null,

	@field:SerializedName("lkr")
	val lkr: String? = null,

	@field:SerializedName("ngn")
	val ngn: String? = null,

	@field:SerializedName("czk")
	val czk: String? = null,

	@field:SerializedName("pkr")
	val pkr: String? = null,

	@field:SerializedName("sek")
	val sek: String? = null,

	@field:SerializedName("ltc")
	val ltc: String? = null,

	@field:SerializedName("uah")
	val uah: String? = null,

	@field:SerializedName("bhd")
	val bhd: String? = null,

	@field:SerializedName("ars")
	val ars: String? = null,

	@field:SerializedName("sar")
	val sar: String? = null,

	@field:SerializedName("inr")
	val inr: String? = null,

	@field:SerializedName("cny")
	val cny: String? = null,

	@field:SerializedName("thb")
	val thb: String? = null,

	@field:SerializedName("krw")
	val krw: String? = null,

	@field:SerializedName("jpy")
	val jpy: String? = null,

	@field:SerializedName("bdt")
	val bdt: String? = null,

	@field:SerializedName("pln")
	val pln: String? = null,

	@field:SerializedName("gbp")
	val gbp: String? = null,

	@field:SerializedName("bmd")
	val bmd: String? = null,

	@field:SerializedName("huf")
	val huf: String? = null,

	@field:SerializedName("xlm")
	val xlm: String? = null,

	@field:SerializedName("sats")
	val sats: String? = null,

	@field:SerializedName("kwd")
	val kwd: String? = null,

	@field:SerializedName("php")
	val php: String? = null,

	@field:SerializedName("yfi")
	val yfi: String? = null,

	@field:SerializedName("rub")
	val rub: String? = null
)

data class MarketCapChange24hInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class PriceChangePercentage1yInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class AthChangePercentage(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class PriceChangePercentage60dInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class AtlChangePercentage(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class PriceChangePercentage14dInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class PriceChangePercentage1hInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class MarketData(

	@field:SerializedName("price_change_percentage_24h")
	val priceChangePercentage24h: Double? = null,

	@field:SerializedName("price_change_24h_in_currency")
	val priceChange24hInCurrency: PriceChange24hInCurrency? = null,

	@field:SerializedName("price_change_percentage_30d")
	val priceChangePercentage30d: Double? = null,

	@field:SerializedName("total_volume")
	val totalVolume: TotalVolume? = null,

	@field:SerializedName("price_change_24h")
	val priceChange24h: Double? = null,

	@field:SerializedName("mcap_to_tvl_ratio")
	val mcapToTvlRatio: Double? = null,

	@field:SerializedName("price_change_percentage_60d")
	val priceChangePercentage60d: Double? = null,

	@field:SerializedName("price_change_percentage_1y_in_currency")
	val priceChangePercentage1yInCurrency: PriceChangePercentage1yInCurrency? = null,

	@field:SerializedName("price_change_percentage_60d_in_currency")
	val priceChangePercentage60dInCurrency: PriceChangePercentage60dInCurrency? = null,

	@field:SerializedName("atl_change_percentage")
	val atlChangePercentage: AtlChangePercentage? = null,

	@field:SerializedName("market_cap_rank")
	val marketCapRank: Double? = null,

	@field:SerializedName("roi")
	val roi: Roi? = null,

	@field:SerializedName("atl_date")
	val atlDate: AtlDate? = null,

	@field:SerializedName("price_change_percentage_200d")
	val priceChangePercentage200d: Double? = null,

	@field:SerializedName("fdv_to_tvl_ratio")
	val fdvToTvlRatio: Double? = null,

	@field:SerializedName("price_change_percentage_14d")
	val priceChangePercentage14d: Double? = null,

	@field:SerializedName("market_cap_change_24h")
	val marketCapChange24h: Double? = null,

	@field:SerializedName("price_change_percentage_7d")
	val priceChangePercentage7d: Double? = null,

	@field:SerializedName("market_cap")
	val marketCap: MarketCap? = null,

	@field:SerializedName("ath")
	val ath: Ath? = null,

	@field:SerializedName("atl")
	val atl: Atl? = null,

	@field:SerializedName("high_24h")
	val high24h: High24h? = null,

	@field:SerializedName("market_cap_change_percentage_24h")
	val marketCapChangePercentage24h: Double? = null,

	@field:SerializedName("price_change_percentage_7d_in_currency")
	val priceChangePercentage7dInCurrency: PriceChangePercentage7dInCurrency? = null,

	@field:SerializedName("ath_change_percentage")
	val athChangePercentage: AthChangePercentage? = null,

	@field:SerializedName("ath_date")
	val athDate: AthDate? = null,

	@field:SerializedName("circulating_supply")
	val circulatingSupply: Double? = null,

	@field:SerializedName("market_cap_change_percentage_24h_in_currency")
	val marketCapChangePercentage24hInCurrency: MarketCapChangePercentage24hInCurrency? = null,

	@field:SerializedName("last_updated")
	val lastUpdated: String? = null,

	// Penyebab error blank data
//	@field:SerializedName("total_value_locked")
//	val totalValueLocked: Double? = null,

	@field:SerializedName("total_supply")
	val totalSupply: Double? = null,

	@field:SerializedName("fully_diluted_valuation")
	val fullyDilutedValuation: FullyDilutedValuation? = null,

	@field:SerializedName("price_change_percentage_24h_in_currency")
	val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrency? = null,

	@field:SerializedName("price_change_percentage_200d_in_currency")
	val priceChangePercentage200dInCurrency: PriceChangePercentage200dInCurrency? = null,

	@field:SerializedName("low_24h")
	val low24h: Low24h? = null,

	@field:SerializedName("max_supply")
	val maxSupply: Double? = null,

	@field:SerializedName("current_price")
	val currentPrice: CurrentPrice? = null,

	@field:SerializedName("price_change_percentage_14d_in_currency")
	val priceChangePercentage14dInCurrency: PriceChangePercentage14dInCurrency? = null,

	@field:SerializedName("market_cap_fdv_ratio")
	val marketCapFdvRatio: Double? = null,

	@field:SerializedName("market_cap_change_24h_in_currency")
	val marketCapChange24hInCurrency: MarketCapChange24hInCurrency? = null,

	@field:SerializedName("price_change_percentage_1h_in_currency")
	val priceChangePercentage1hInCurrency: PriceChangePercentage1hInCurrency? = null,

	@field:SerializedName("price_change_percentage_30d_in_currency")
	val priceChangePercentage30dInCurrency: PriceChangePercentage30dInCurrency? = null,

	@field:SerializedName("price_change_percentage_1y")
	val priceChangePercentage1y: Double? = null,

	@SerializedName("sparkline_7d")
	val sparkline: Sparkline?,

	@field:SerializedName("history_chart")
	val historyChart: HistoryChartResponse?
)

data class DeveloperData(

	@field:SerializedName("forks")
	val forks: Double? = null,

	@field:SerializedName("total_issues")
	val totalIssues: Double? = null,

	@field:SerializedName("pull_request_contributors")
	val pullRequestContributors: Double? = null,

	@field:SerializedName("code_additions_deletions_4_weeks")
	val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks? = null,

	@field:SerializedName("subscribers")
	val subscribers: Double? = null,

	@field:SerializedName("commit_count_4_weeks")
	val commitCount4Weeks: Double? = null,

	@field:SerializedName("pull_requests_merged")
	val pullRequestsMerged: Double? = null,

	@field:SerializedName("stars")
	val stars: Double? = null,

	@field:SerializedName("last_4_weeks_commit_activity_series")
	val last4WeeksCommitActivitySeries: List<Any?>? = null,

	@field:SerializedName("closed_issues")
	val closedIssues: Double? = null
)

//data class ConvertedLast(
//
//	@field:SerializedName("btc")
//	val btc: Double? = null,
//
//	@field:SerializedName("usd")
//	val usd: Double? = null,
//
//	@field:SerializedName("eth")
//	val eth: Double? = null
//)

data class PriceChangePercentage7dInCurrency(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class JsonMember(

	@field:SerializedName("contract_address")
	val contractAddress: String? = null,

	@field:SerializedName("decimal_place")
	val decimalPlace: Double? = null
)

data class Image(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("thumb")
	val thumb: String? = null
)

@Suppress("unused")
data class Ath(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class Atl(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class High24h(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

//data class Market(
//
//	@field:SerializedName("identifier")
//	val identifier: String? = null,
//
//	@field:SerializedName("name")
//	val name: String? = null,
//
//	@field:SerializedName("has_trading_incentive")
//	val hasTradingIncentive: Boolean? = null
//)

data class Localization(

	@field:SerializedName("de")
	val de: String? = null,

	@field:SerializedName("en")
	val en: String? = null
)

data class ReposUrl(

	@field:SerializedName("github")
	val github: List<String?>? = null,

	@field:SerializedName("bitbucket")
	val bitbucket: List<Any?>? = null
)

data class Description(

	@field:SerializedName("de")
	val de: String? = null,

	@field:SerializedName("en")
	val en: String? = null
)

data class MarketCap(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class Platforms(

	@field:SerializedName("")
	val jsonMember: String? = null
)

// Penyebab error blank data
//data class TickersItem(
//
//	@field:SerializedName("last_fetch_at")
//	val lastFetchAt: String? = null,
//
//	@field:SerializedName("is_anomaly")
//	val isAnomaly: Boolean? = null,
//
//	@field:SerializedName("last")
//	val last: Double? = null,
//
//	@field:SerializedName("last_traded_at")
//	val lastTradedAt: String? = null,
//
//	@field:SerializedName("coin_id")
//	val coinId: String? = null,
//
//	@field:SerializedName("converted_volume")
//	val convertedVolume: ConvertedVolume? = null,
//
//	@field:SerializedName("target_coin_id")
//	val targetCoinId: String? = null,
//
//	@field:SerializedName("is_stale")
//	val isStale: Boolean? = null,
//
//	@field:SerializedName("target")
//	val target: String? = null,
//
//	@field:SerializedName("market")
//	val market: Market? = null,
//
//	@field:SerializedName("volume")
//	val volume: Double? = null,
//
//	@field:SerializedName("bid_ask_spread_percentage")
//	val bidAskSpreadPercentage: Double? = null,
//
//	@field:SerializedName("trade_url")
//	val tradeUrl: String? = null,
//
//	@field:SerializedName("converted_last")
//	val convertedLast: ConvertedLast? = null,
//
//	@field:SerializedName("token_info_url")
//	val tokenInfoUrl: Double? = null,
//
//	@field:SerializedName("trust_score")
//	val trustScore: String? = null,
//
//	@field:SerializedName("base")
//	val base: String? = null,
//
//	@field:SerializedName("timestamp")
//	val timestamp: String? = null
//)

data class FullyDilutedValuation(

	@field:SerializedName("usd")
	val usd: Double? = null,

	@field:SerializedName("xdr")
	val xdr: Double? = null,

	@field:SerializedName("eos")
	val eos: Double? = null,

	@field:SerializedName("sgd")
	val sgd: Double? = null,

	@field:SerializedName("vef")
	val vef: Double? = null,

	@field:SerializedName("bnb")
	val bnb: Double? = null,

	@field:SerializedName("eth")
	val eth: Double? = null,

	@field:SerializedName("nzd")
	val nzd: Double? = null,

	@field:SerializedName("brl")
	val brl: Double? = null,

	@field:SerializedName("xag")
	val xag: Double? = null,

	@field:SerializedName("chf")
	val chf: Double? = null,

	@field:SerializedName("mxn")
	val mxn: Double? = null,

	@field:SerializedName("clp")
	val clp: Double? = null,

	@field:SerializedName("bits")
	val bits: Double? = null,

	@field:SerializedName("zar")
	val zar: Double? = null,

	@field:SerializedName("vnd")
	val vnd: Double? = null,

	@field:SerializedName("xau")
	val xau: Double? = null,

	@field:SerializedName("aud")
	val aud: Double? = null,

	@field:SerializedName("ils")
	val ils: Double? = null,

	@field:SerializedName("idr")
	val idr: Double? = null,

	@field:SerializedName("xrp")
	val xrp: Double? = null,

	@field:SerializedName("try")
	val jsonMemberTry: Double? = null,

	@field:SerializedName("hkd")
	val hkd: Double? = null,

	@field:SerializedName("twd")
	val twd: Double? = null,

	@field:SerializedName("aed")
	val aed: Double? = null,

	@field:SerializedName("eur")
	val eur: Double? = null,

	@field:SerializedName("dkk")
	val dkk: Double? = null,

	@field:SerializedName("bch")
	val bch: Double? = null,

	@field:SerializedName("cad")
	val cad: Double? = null,

	@field:SerializedName("myr")
	val myr: Double? = null,

	@field:SerializedName("dot")
	val dot: Double? = null,

	@field:SerializedName("link")
	val link: Double? = null,

	@field:SerializedName("mmk")
	val mmk: Double? = null,

	@field:SerializedName("nok")
	val nok: Double? = null,

	@field:SerializedName("gel")
	val gel: Double? = null,

	@field:SerializedName("btc")
	val btc: Double? = null,

	@field:SerializedName("lkr")
	val lkr: Double? = null,

	@field:SerializedName("ngn")
	val ngn: Double? = null,

	@field:SerializedName("czk")
	val czk: Double? = null,

	@field:SerializedName("pkr")
	val pkr: Double? = null,

	@field:SerializedName("sek")
	val sek: Double? = null,

	@field:SerializedName("ltc")
	val ltc: Double? = null,

	@field:SerializedName("uah")
	val uah: Double? = null,

	@field:SerializedName("bhd")
	val bhd: Double? = null,

	@field:SerializedName("ars")
	val ars: Double? = null,

	@field:SerializedName("sar")
	val sar: Double? = null,

	@field:SerializedName("inr")
	val inr: Double? = null,

	@field:SerializedName("cny")
	val cny: Double? = null,

	@field:SerializedName("thb")
	val thb: Double? = null,

	@field:SerializedName("krw")
	val krw: Double? = null,

	@field:SerializedName("jpy")
	val jpy: Double? = null,

	@field:SerializedName("bdt")
	val bdt: Double? = null,

	@field:SerializedName("pln")
	val pln: Double? = null,

	@field:SerializedName("gbp")
	val gbp: Double? = null,

	@field:SerializedName("bmd")
	val bmd: Double? = null,

	@field:SerializedName("huf")
	val huf: Double? = null,

	@field:SerializedName("xlm")
	val xlm: Double? = null,

	@field:SerializedName("sats")
	val sats: Double? = null,

	@field:SerializedName("kwd")
	val kwd: Double? = null,

	@field:SerializedName("php")
	val php: Double? = null,

	@field:SerializedName("yfi")
	val yfi: Double? = null,

	@field:SerializedName("rub")
	val rub: Double? = null
)

data class DetailPlatforms(

	@field:SerializedName("")
	val jsonMember: JsonMember? = null
)

data class CommunityData(

	@field:SerializedName("twitter_followers")
	val twitterFollowers: Double? = null,

	@field:SerializedName("telegram_channel_user_count")
	val telegramChannelUserCount: Double? = null,

	@field:SerializedName("facebook_likes")
	val facebookLikes: Double? = null,

	@field:SerializedName("reddit_subscribers")
	val redditSubscribers: Double? = null,

	@field:SerializedName("reddit_average_posts_48h")
	val redditAveragePosts48h: Double? = null,

	@field:SerializedName("reddit_average_comments_48h")
	val redditAverageComments48h: Double? = null,

	@field:SerializedName("reddit_accounts_active_48h")
	val redditAccountsActive48h: Double? = null
)
