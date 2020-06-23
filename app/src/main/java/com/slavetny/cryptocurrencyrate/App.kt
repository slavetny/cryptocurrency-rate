package com.slavetny.cryptocurrencyrate

import android.app.Application
import com.slavetny.cryptocurrencyrate.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(
                listOf (viewModelModule)
            )
        }
    }
}