package com.example.fetchingdata.repository

import com.example.fetchingdata.api.ApiService

class NewsRepository (private val apiService: ApiService){
    suspend fun getBreakingNews(countyCode: String, pageNumber: Int) =
        apiService.getBreakingNews(countyCode, pageNumber)
}