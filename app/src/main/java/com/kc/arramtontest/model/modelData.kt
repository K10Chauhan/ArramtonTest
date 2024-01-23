package com.kc.arramtontest.model


import com.google.gson.annotations.SerializedName

data class modelData(
    @SerializedName("data")
    val `data`: MutableList<Data>,
    @SerializedName("message")
    val message: String, // Tools Data Fetched
    @SerializedName("success")
    val success: Boolean // true
)