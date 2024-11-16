package com.example.myapplication.data.datasource

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinx.serialization.Serializable

@Serializable
data class EmojisResponse(
    val emojis: List<EmojiResponse>
)

@Serializable
data class EmojiResponse(
    val id: String,
)

