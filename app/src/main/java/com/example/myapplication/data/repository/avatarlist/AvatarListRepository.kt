package com.example.myapplication.data.repository.avatarlist

import com.example.myapplication.data.datasource.AvatarsResponse

interface AvatarListRepository {
    suspend fun getAvatar (user: String): AvatarsResponse
}