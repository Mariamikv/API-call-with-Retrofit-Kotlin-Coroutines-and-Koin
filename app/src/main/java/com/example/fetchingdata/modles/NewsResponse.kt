package com.example.fetchingdata.modles

import android.os.Parcelable
import com.example.fetchingdata.modles.Article
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsResponse(
    @SerializedName("articles")
    val articles: MutableList<Article>?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: Int?
): Parcelable