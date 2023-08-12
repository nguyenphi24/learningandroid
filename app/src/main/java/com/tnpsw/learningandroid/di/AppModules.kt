package com.tnpsw.learningandroid.di

import android.content.Context
import androidx.preference.PreferenceManager
import com.google.gson.Gson
import com.tnpsw.learningandroid.data.local.shareprefs.ISharePreferences
import com.tnpsw.learningandroid.data.local.shareprefs.SharePreferencesImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by tnphi on 12/08/2023.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModules {
    @Singleton
    @Provides
    fun provideGson(): Gson = Gson()

    @Singleton
    @Provides
    fun provideSharePreferences(@ApplicationContext context: Context, gson: Gson): ISharePreferences {
        val sharePrefs = PreferenceManager.getDefaultSharedPreferences(context)
        return SharePreferencesImpl(sharePrefs, gson)
    }
}