package com.example.myapplication.data.repository.randomemoji

import com.example.myapplication.data.model.EmojiDto

interface EmojiRepository {
    suspend fun getList(): List<EmojiDto>
}