package com.workmanager

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("500/300")
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://picsum.photos/")
                .build()
                .create(FileApi::class.java)
        }
    }
}