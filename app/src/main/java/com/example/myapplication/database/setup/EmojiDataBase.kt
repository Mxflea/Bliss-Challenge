package com.example.myapplication.database.setup

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.database.dao.EmojiDao
import com.example.myapplication.database.entity.EmojiDb

@Database(entities = [EmojiDb::class], version = 1)
abstract class EmojiDataBase : RoomDatabase() {
    abstract fun emojiDao(): EmojiDao
}