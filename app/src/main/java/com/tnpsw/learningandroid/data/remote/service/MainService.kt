package com.tnpsw.learningandroid.data.remote.service

import com.google.gson.JsonArray
import retrofit2.http.GET

/**
 * Created by tnphi on 12/08/2023.
 */

interface MainService {
    @GET
    suspend fun fetch(): JsonArray
}