package com.tnpsw.learningandroid.data.repository

import com.google.gson.JsonArray
import kotlinx.coroutines.flow.Flow

/**
 * Created by tnphi on 12/08/2023.
 */

interface MainRepository {
    fun fetch(): Flow<JsonArray>
}