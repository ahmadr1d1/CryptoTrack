package com.ahmadrd.cryptotrack.data.local.entity

import androidx.room.*

@Entity(tableName = "favorite_coins")
data class FavoritesCoin(
    @PrimaryKey val coinsId: String,
    val name: String,
    val symbol: String,
    val imageUrl: String?,
    val homepageUrl: String?,
    val addedAt: Long = System.currentTimeMillis()
)
