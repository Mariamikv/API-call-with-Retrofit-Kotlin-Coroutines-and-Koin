package com.example.fetchingdata.api.di

import com.example.fetchingdata.view_model.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { NewsViewModel(get()) }
}