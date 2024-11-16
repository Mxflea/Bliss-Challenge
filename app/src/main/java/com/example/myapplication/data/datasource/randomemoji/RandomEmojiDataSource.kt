package com.example.myapplication.data.datasource.randomemoji

import com.example.myapplication.data.datasource.EmojisResponse

interface RandomEmojiDataSource {
    fun getList(): EmojisResponse{
        return EmojisResponse()
    }
}