package com.example.myapplication.database.di

import android.app.Application
import androidx.room.Room
import com.example.myapplication.data.repository.randomemoji.RandomEmojiRepository
import com.example.myapplication.data.repository.randomemoji.RandomEmojiRepositoryImpl
import com.example.myapplication.data.datasource.randomemoji.RandomEmojiDataSource
import com.example.myapplication.data.datasource.randomemoji.RandomEmojiDataSourceImpl
import com.example.myapplication.database.dao.EmojiDao
import com.example.myapplication.database.setup.EmojiDataBase
import com.example.myapplication.presentation.randomemoji.RandomEmojiViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

fun provideDataBase(application: Application): EmojiDataBase =
    Room.databaseBuilder(
        application,
        EmojiDataBase::class.java,
        "table_post"
    ).
    fallbackToDestructiveMigration().build()

fun provideDao(emojiDao: EmojiDataBase): EmojiDao = emojiDao.emojiDao()


val dataBaseModule = module {
    single  { provideDataBase(get()) }
    single { provideDao(get())  }
}