package com.tnpsw.learningandroid.di

import com.tnpsw.learningandroid.data.local.shareprefs.ISharePreferences
import com.tnpsw.learningandroid.data.remote.datasource.MainRemoteDataSource
import com.tnpsw.learningandroid.data.remote.impl.MainRemoteDataSourceImpl
import com.tnpsw.learningandroid.data.repository.MainRepository
import com.tnpsw.learningandroid.data.repository.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by tnphi on 12/08/2023.
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModules {
    @Binds
    @Singleton
    abstract fun provideMainRepository(mainRepositoryImpl: MainRepositoryImpl): MainRepository

    @Binds
    @Singleton
    abstract fun provideMainRemoteDataSource(mainRemoteDataSource: MainRemoteDataSourceImpl): MainRemoteDataSource
}