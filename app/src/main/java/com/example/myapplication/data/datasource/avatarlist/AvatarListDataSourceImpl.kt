package com.example.myapplication.data.datasource.avatarlist

import com.example.myapplication.data.datasource.AvatarsResponse

class AvatarListDataSourceImpl: AvatarListDataSource {
    override fun getAvatar(): AvatarsResponse {
        return AvatarsResponse()
    }
}