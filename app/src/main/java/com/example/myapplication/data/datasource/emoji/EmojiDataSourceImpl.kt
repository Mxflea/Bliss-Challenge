package com.example.myapplication.data.datasource.emoji

import android.util.Log
import com.example.myapplication.data.datasource.AvatarsResponse
import com.example.myapplication.data.model.Emoji
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

const val BASE_URL = "https://api.github.com"
const val EMOJIS_END_POINT = "/emojis"

class EmojiDataSourceImpl : EmojiDataSource {

    override suspend fun getAvatar(): AvatarsResponse {
        val result = request<Map<String, String>>(EMOJIS_END_POINT)
        return AvatarsResponse()
    }

    override suspend fun getList(): List<Emoji> {
        val result = request<Map<String, String>>(EMOJIS_END_POINT)
        return result.entries.map { result ->
            Emoji(
                name = result.key,
                url = result.value
            )
        }
    }

    private suspend inline fun <reified T> request(endPoint:String): T {
       return setupKtor().get("$BASE_URL$endPoint").body<T>()
    }

    private fun setupKtor() = HttpClient(Android) {
        install(Logging) {
            level = LogLevel.ALL
        }
        defaultRequest {
            url(BASE_URL)
        }
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }

}