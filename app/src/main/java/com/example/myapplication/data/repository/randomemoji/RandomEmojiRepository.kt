package com.example.myapplication.data.repository.randomemoji

import com.example.myapplication.data.datasource.EmojisResponse

interface RandomEmojiRepository {
    suspend fun getList(): EmojisResponse
}