package com.tnpsw.learningandroid.data.remote.datasource

import com.google.gson.JsonArray
import kotlinx.coroutines.flow.Flow

/**
 * Created by tnphi on 12/08/2023.
 */

interface MainRemoteDataSource {
    fun fetch(): Flow<JsonArray>
}