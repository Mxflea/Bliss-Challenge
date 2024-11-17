package com.example.myapplication.data.repository.randomemoji

import com.example.myapplication.data.model.EmojiDto

interface RandomEmojiRepository {
    suspend fun getList(): List<EmojiDto>
}