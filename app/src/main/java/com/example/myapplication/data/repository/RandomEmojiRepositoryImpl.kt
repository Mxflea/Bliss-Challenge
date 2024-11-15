package com.example.myapplication.data.repository

import com.example.myapplication.data.datasource.RandomEmojiDataSource

class RandomEmojiRepositoryImpl(val dataSource: RandomEmojiDataSource) : RandomEmojiRepository {
    override fun getList() {
        dataSource.getList()
    }
}