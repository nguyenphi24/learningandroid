package com.tnpsw.learningandroid.data.remote.impl

import com.google.gson.JsonArray
import com.tnpsw.learningandroid.data.remote.RetrofitFactory
import com.tnpsw.learningandroid.data.remote.datasource.MainRemoteDataSource
import com.tnpsw.learningandroid.data.remote.service.MainService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

/**
 * Created by tnphi on 12/08/2023.
 */

class MainRemoteDataSourceImpl @Inject constructor(): MainRemoteDataSource {
    override fun fetch(): Flow<JsonArray> {
        val service = RetrofitFactory.provide(MainService::class.java)
        return flow {
            val response = service.fetch()
            emit(response)
        }.flowOn(Dispatchers.IO)
    }
}