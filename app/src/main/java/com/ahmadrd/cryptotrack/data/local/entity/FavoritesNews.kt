package com.ahmadrd.cryptotrack.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_news")
data class FavoritesNews(
    @PrimaryKey val newsId: Int,
    val title: String? = null,
    val source: String? = null,
    val publishedAt: String? = null,
    val positiveVotes: Int? = null,
    val negativeVotes: Int? = null,
    val importantVotes: Int? = null,
    val addedAt: Long = System.currentTimeMillis()
    
)
