package com.example.fetchingdata.api.di

import com.example.fetchingdata.api.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module{
    single(createdAtStart = false) {
        get<Retrofit>().create(ApiService::class.java)
    }
}