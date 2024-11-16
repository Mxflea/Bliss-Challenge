package com.example.myapplication.data.datasource.emojilist

import com.example.myapplication.data.datasource.EmojisResponse

interface EmojiListDataSource {
    fun getList (): EmojisResponse{
        return EmojisResponse()
    }
}