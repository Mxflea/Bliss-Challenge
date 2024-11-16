package com.example.myapplication.database.setup

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.database.dao.EmojiDao
import com.example.myapplication.database.entity.Emoji

@Database(entities = [Emoji::class], version = 1)
abstract class ConfigRoom : RoomDatabase() {
    abstract fun userDao(): EmojiDao
}