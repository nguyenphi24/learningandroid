package com.tnpsw.learningandroid.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by tnphi on 12/08/2023.
 */
data class ResponseModel<T>(
    @SerializedName("result")
    val result: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: T?,
)
