package com.kc.arramtontest.network

import com.google.gson.GsonBuilder
import com.kc.arramtontest.util.Constants.Companion.BASE_URL

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInst {

    companion object{
        private val retrofit by lazy{
            val logyiing= HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

            val clientt = OkHttpClient.Builder()
                .addInterceptor(logyiing)
                .build()

            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .client(clientt)
                .build()
        }
        val api by lazy {
            retrofit.create(MyApi::class.java)
        }
    }
}