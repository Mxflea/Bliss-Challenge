package com.example.myapplication.presentation.di

import com.example.myapplication.data.datasource.emoji.EmojiDataSource
import com.example.myapplication.data.datasource.emoji.EmojiDataSourceImpl
import com.example.myapplication.data.repository.randomemoji.EmojiRepository
import com.example.myapplication.data.repository.randomemoji.EmojiRepositoryImpl
import com.example.myapplication.presentation.randomemoji.RandomEmojiViewModel
import com.example.myapplication.presentation.emojilist.EmojiListViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val blissModule = module {
    singleOf(::EmojiRepositoryImpl) { bind<EmojiRepository>() }
    singleOf(::EmojiDataSourceImpl) { bind<EmojiDataSource>() }
    viewModelOf(::RandomEmojiViewModel)
    viewModelOf(::EmojiListViewModel)
}