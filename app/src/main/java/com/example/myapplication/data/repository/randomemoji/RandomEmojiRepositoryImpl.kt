package com.example.myapplication.data.repository.randomemoji

import com.example.myapplication.data.datasource.EmojisResponse
import com.example.myapplication.data.datasource.randomemoji.RandomEmojiDataSource

class RandomEmojiRepositoryImpl(
    val dataSource: RandomEmojiDataSource) : RandomEmojiRepository
{
    override suspend fun getList(): EmojisResponse {
        dataSource.getList()
        return TODO("Provide the return value")
    }
}