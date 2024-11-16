package com.example.myapplication.database.di

import android.app.Application
import androidx.room.Room
import com.example.myapplication.database.dao.EmojiDao
import com.example.myapplication.database.setup.EmojiDataBase
import org.koin.dsl.module

fun provideDataBase(application: Application): EmojiDataBase =
    Room.databaseBuilder(
        application,
        EmojiDataBase::class.java,
        "table_post"
    ).fallbackToDestructiveMigration().build()

fun provideDao(emojiDao: EmojiDataBase): EmojiDao = emojiDao.emojiDao()


val dataBaseModule = module {
    single { provideDataBase(get()) }
    single { provideDao(get()) }
}