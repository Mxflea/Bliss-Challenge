package com.example.myapplication.data.repository.randomemoji

import com.example.myapplication.data.model.Emoji

interface RandomEmojiRepository {
    suspend fun getList(): List<Emoji>
}