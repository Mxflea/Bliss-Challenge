package com.example.myapplication.data.datasource.emoji

import com.example.myapplication.data.datasource.AvatarsResponse
import com.example.myapplication.data.model.EmojiDto

interface EmojiDataSource {
    suspend fun getAvatar (): AvatarsResponse
    suspend fun getList (): List<EmojiDto>
}