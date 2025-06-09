package com.ahmadrd.cryptotrack.data.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ahmadrd.cryptotrack.data.local.entity.FavoritesNews

@Dao
interface FavoritesNewsDao {

    @Query("SELECT * FROM favorite_news WHERE newsId = :newsId")
    fun getFavNewsById(newsId: Int): LiveData<List<FavoritesNews>>

    @Query("SELECT * FROM favorite_news ORDER BY addedAt ASC")
    fun getFavNews(): LiveData<List<FavoritesNews>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavNews(favNews: FavoritesNews)

    @Delete
    suspend fun deleteFavNews(favNews: FavoritesNews)
}