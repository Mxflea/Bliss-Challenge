package com.example.myapplication.data.datasource.emojilist

import com.example.myapplication.data.datasource.EmojisResponse

class EmojiListDataSourceImpl: EmojiListDataSource {
    override fun getList(): EmojisResponse {
        return EmojisResponse()
    }
}