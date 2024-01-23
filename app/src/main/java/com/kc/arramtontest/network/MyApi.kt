package com.kc.arramtontest.network

import com.kc.arramtontest.model.modelData
import retrofit2.Response
import retrofit2.http.GET

interface MyApi {
 //   http://192.168.29.233:8007/api/interview/test
    @GET("api/interview/test")
    suspend fun getData() : Response<modelData>
}