package com.example.myapplication.data.repository

import com.example.myapplication.data.datasource.DataSource

class RepositoryImpl(val dataSource: DataSource) : Repository {
    override fun getList() {
        dataSource.getList()
    }
}