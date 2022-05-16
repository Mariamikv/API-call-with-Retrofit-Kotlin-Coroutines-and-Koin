package com.example.fetchingdata.api.di

import com.example.fetchingdata.repository.NewsRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { NewsRepository(get()) }
}