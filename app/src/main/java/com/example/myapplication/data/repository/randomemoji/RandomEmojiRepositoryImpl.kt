package com.example.myapplication.data.repository.randomemoji

import android.util.Log
import com.example.myapplication.data.datasource.EmojisResponse
import com.example.myapplication.data.datasource.randomemoji.RandomEmojiDataSource
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class RandomEmojiRepositoryImpl(
    private val dataSource: RandomEmojiDataSource,
) : RandomEmojiRepository {
    override suspend fun getList(): EmojisResponse {
//        val httpClient = HttpClient(Android) {
//            install(Logging) {
//                level = LogLevel.ALL
//            }
//            install(ContentNegotiation) {
//                json(Json {
//                    ignoreUnknownKeys = true
//                })
//            }
//        }
//        val result = httpClient.get("https://api.github.com/emojis").body<Map<String, String>>()
//        Log.d("STATUS_REQUEST", "getList: ${result}")
        return EmojisResponse()
    }
}