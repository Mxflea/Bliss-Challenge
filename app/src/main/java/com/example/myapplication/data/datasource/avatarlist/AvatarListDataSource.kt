package com.example.myapplication.data.datasource.avatarlist

import com.example.myapplication.data.datasource.AvatarsResponse

interface AvatarListDataSource {
    fun getAvatar (): AvatarsResponse {
        return AvatarsResponse()
    }
}