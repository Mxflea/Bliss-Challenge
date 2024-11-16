package com.example.myapplication.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "produto")
data class Emoji(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "first_name") val name: String?,
    @ColumnInfo(name = "last_name") val descricao: String?
)