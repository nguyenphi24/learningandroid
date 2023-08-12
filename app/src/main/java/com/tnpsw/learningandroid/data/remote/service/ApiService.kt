package com.tnpsw.learningandroid.data.remote.service

import com.google.gson.JsonArray
import com.tnpsw.learningandroid.data.model.ResponseModel
import retrofit2.http.POST

/**
 * Created by tnphi on 12/08/2023.
 */

interface ApiService {
    @POST("")
    suspend fun homepage(): ResponseModel<JsonArray>
}