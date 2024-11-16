package com.example.myapplication.application

import android.app.Application
import com.example.myapplication.database.di.dataBaseModule
import com.example.myapplication.presentation.di.blissModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BlissChallengeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@BlissChallengeApplication)
            modules(blissModule + dataBaseModule)
        }
    }
}