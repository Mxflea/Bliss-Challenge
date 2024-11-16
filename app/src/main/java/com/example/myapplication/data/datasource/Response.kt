package com.example.myapplication.data.datasource

import kotlinx.serialization.Serializable

@Serializable
data class EmojisResponse(
    val emojis: List<EmojiResponse> = emptyList()
)

@Serializable
data class EmojiResponse(
    val id: String,
)

