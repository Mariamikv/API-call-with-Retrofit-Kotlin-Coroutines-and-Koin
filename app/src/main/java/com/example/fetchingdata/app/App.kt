package com.example.fetchingdata.app

import android.app.Application
import android.content.Context
import com.example.fetchingdata.api.di.apiModule
import com.example.fetchingdata.api.di.repositoryModule
import com.example.fetchingdata.api.di.retrofitModule
import com.example.fetchingdata.api.di.viewModelModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class App : Application(){
    companion object{
        lateinit var instance: App

        fun applicationContext() : Context {
            return instance.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(listOf(
                apiModule,
                viewModelModule,
                repositoryModule,
                retrofitModule
            ))
        }

        instance = this
    }
}