package com.ahmadrd.cryptotrack.data.local.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ahmadrd.cryptotrack.data.local.entity.FavoritesCoin

@Dao
interface FavoritesCoinDao {

    @Query("SELECT * FROM favorite_coins WHERE coinsId = :coinsId")
    fun getFavCoinById(coinsId: String): LiveData<List<FavoritesCoin>>

    @Query("SELECT * FROM favorite_coins ORDER BY addedAt ASC")
    fun getFavCoin(): LiveData<List<FavoritesCoin>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavCoin(favCoin: FavoritesCoin)

    @Delete
    suspend fun deleteFavCoin(favCoin: FavoritesCoin)
}