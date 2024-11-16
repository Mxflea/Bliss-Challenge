package com.example.myapplication.data.datasource.randomemoji

import com.example.myapplication.data.datasource.EmojisResponse

class RandomEmojiDataSourceImpl : RandomEmojiDataSource {
    override fun getList(): EmojisResponse {
        return EmojisResponse()
    }
}