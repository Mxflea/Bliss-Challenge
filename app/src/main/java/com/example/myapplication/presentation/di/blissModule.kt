package com.example.myapplication.presentation.di

import com.example.myapplication.data.repository.randomemoji.RandomEmojiRepository
import com.example.myapplication.data.repository.randomemoji.RandomEmojiRepositoryImpl
import com.example.myapplication.data.datasource.randomemoji.RandomEmojiDataSource
import com.example.myapplication.data.datasource.randomemoji.RandomEmojiDataSourceImpl
import com.example.myapplication.data.repository.emojilist.EmojiListRepository
import com.example.myapplication.presentation.randomemoji.RandomEmojiViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val blissModule = module {
    singleOf(::RandomEmojiRepositoryImpl) { bind<RandomEmojiRepository>() }
    singleOf(::RandomEmojiDataSourceImpl) { bind<RandomEmojiDataSource>() }
    viewModelOf(::RandomEmojiViewModel)

    singleOf(::RandomEmojiRepositoryImpl) { bind<RandomEmojiRepository>() }
}