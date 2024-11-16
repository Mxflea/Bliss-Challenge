package com.example.myapplication.data.repository.emojilist

import com.example.myapplication.data.datasource.EmojisResponse

interface EmojiListRepository {
    suspend fun getList(): EmojisResponse
}