package com.example.myapplication.data.repository.avatarlist

import com.example.myapplication.data.datasource.AvatarResponse
import com.example.myapplication.data.datasource.AvatarsResponse
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

class AvatarListRepositoryImpl(

): AvatarListRepository {
    override suspend fun getAvatar(user: String): AvatarsResponse {
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
//        val result = httpClient.get("https://api.github.com/users/$user").body<AvatarsResponse>()
        return AvatarsResponse()
    }
}