package com.example.myapplication.data.repository.emojilist

import com.example.myapplication.data.model.EmojiDto

interface EmojiListRepository {
    suspend fun getList(): List<EmojiDto>
}