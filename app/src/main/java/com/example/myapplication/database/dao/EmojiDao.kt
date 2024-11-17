package com.example.myapplication.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.data.model.EmojiDto
import com.example.myapplication.database.entity.EmojiDb

@Dao
interface EmojiDao {

    @Insert
    suspend fun insertAll(emoji: List<EmojiDb>)

    @Query("SELECT * FROM emoji_db")
    suspend fun getAll():List<EmojiDb>

}