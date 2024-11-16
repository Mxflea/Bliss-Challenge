package com.example.myapplication.data.datasource

import kotlinx.serialization.Serializable

@Serializable
data class EmojisResponse(
    val emojis: Map<String, String> = mapOf()
)

@Serializable
data class EmojiResponse(
    val id: String,
)

data class AvatarsResponse(
    val avatars: List<AvatarResponse> = emptyList()
)

@Serializable
data class AvatarResponse(
    val id: String
)
