package com.ahmadrd.cryptotrack.data.local.room

import android.content.Context
import androidx.room.*
import com.ahmadrd.cryptotrack.data.local.entity.FavoritesCoin
import com.ahmadrd.cryptotrack.data.local.entity.FavoritesNews

/**
 * Learn Migration Database with Room
 */
@Database(entities = [FavoritesCoin::class, FavoritesNews::class], version = 1, exportSchema = true)
abstract class FavoritesDatabase : RoomDatabase() {

    abstract fun favoritesCoinDao(): FavoritesCoinDao
    abstract fun favoritesNewsDao(): FavoritesNewsDao

    companion object {
        @Volatile
        private var INSTANCE: FavoritesDatabase? = null
        fun getInstance(context: Context): FavoritesDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    FavoritesDatabase::class.java,
                    "favorites.db"
                ).build()
            }
    }
}