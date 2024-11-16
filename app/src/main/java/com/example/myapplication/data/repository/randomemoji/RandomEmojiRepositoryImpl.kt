package com.example.myapplication.data.repository.randomemoji

import com.example.myapplication.data.datasource.emoji.EmojiDataSource

class RandomEmojiRepositoryImpl(
    private val dataSource: EmojiDataSource,
) : RandomEmojiRepository {

    override suspend fun getList() = dataSource.getList()

}