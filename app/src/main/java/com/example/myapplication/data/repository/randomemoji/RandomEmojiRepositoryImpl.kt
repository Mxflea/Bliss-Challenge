package com.example.myapplication.data.repository.randomemoji

import com.example.myapplication.data.datasource.emoji.EmojiDataSource
import com.example.myapplication.data.model.EmojiDto
import com.example.myapplication.database.dao.EmojiDao
import com.example.myapplication.database.entity.EmojiDb

class RandomEmojiRepositoryImpl(
    private val dataSource: EmojiDataSource,
    private val dao: EmojiDao
) : RandomEmojiRepository {

    override suspend fun getList():List<EmojiDto>{
       return if(dao.getAll().isNotEmpty()){
           dao.getAll().map { items ->
               EmojiDto(
                   name = items.name.orEmpty(),
                   url = items.url.orEmpty()
               )
           }
       } else {
           val resultApi = dataSource.getList()
           val mapperToEmojiDb = resultApi.map {
               EmojiDb(
                   name = it.name,
                   url = it.url
               )
           }
           dao.insertAll(mapperToEmojiDb)
           resultApi
       }
    }

}



