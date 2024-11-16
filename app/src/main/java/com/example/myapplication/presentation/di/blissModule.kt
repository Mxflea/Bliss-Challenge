package com.example.myapplication.presentation.di

import com.example.myapplication.data.datasource.emoji.EmojiDataSource
import com.example.myapplication.data.datasource.emoji.EmojiDataSourceImpl
import com.example.myapplication.data.repository.randomemoji.RandomEmojiRepository
import com.example.myapplication.data.repository.randomemoji.RandomEmojiRepositoryImpl
import com.example.myapplication.presentation.randomemoji.RandomEmojiViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val blissModule = module {
    singleOf(::RandomEmojiRepositoryImpl) { bind<RandomEmojiRepository>() }
    singleOf(::EmojiDataSourceImpl) { bind<EmojiDataSource>() }
    viewModelOf(::RandomEmojiViewModel)

    singleOf(::RandomEmojiRepositoryImpl) { bind<RandomEmojiRepository>() }
}