package com.example.myapplication.data.repository.randomemoji

import android.util.Log
import com.example.myapplication.data.datasource.EmojisResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

interface RandomEmojiRepository {
    suspend fun getList(): EmojisResponse
}