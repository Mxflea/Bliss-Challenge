package com.example.myapplication.data.repository.avatarlist

import com.example.myapplication.data.datasource.AvatarsResponse
import com.example.myapplication.data.datasource.emoji.EmojiDataSource

class AvatarListRepositoryImpl(
    private val dataSource: EmojiDataSource,
) : AvatarListRepository {
    override suspend fun getAvatar(user: String): AvatarsResponse {
        return AvatarsResponse()
    }
}