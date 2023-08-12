package com.tnpsw.learningandroid.data.remote

import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

/**
 * Created by tnphi on 12/08/2023.
 */

object RetrofitFactory {
    private fun getOkHttpClient(): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
            .dispatcher(Dispatcher())
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
        return okHttpClient
    }

    fun <T> provide(service: Class<T>): T {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://emcb2cstage.mytv.vn/")
            .client(getOkHttpClient())
            .build()
        return retrofit.create(service)
    }
}