package com.tnpsw.learningandroid.data.repository

import com.google.gson.JsonArray
import com.tnpsw.learningandroid.data.local.shareprefs.ISharePreferences
import com.tnpsw.learningandroid.data.remote.datasource.MainRemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by tnphi on 12/08/2023.
 */

class MainRepositoryImpl @Inject constructor(
    private val mainRemoteDataSource: MainRemoteDataSource,
    private val shares: ISharePreferences
): MainRepository {
    override fun fetch(): Flow<JsonArray> {
        return mainRemoteDataSource.fetch()
    }
}