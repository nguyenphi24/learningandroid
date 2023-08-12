package com.tnpsw.learningandroid.data.local.shareprefs

import android.content.SharedPreferences
import com.google.gson.Gson
import javax.inject.Inject

/**
 * Created by tnphi on 12/08/2023.
 */

class SharePreferencesImpl @Inject constructor(
    private val sharePreferences: SharedPreferences,
    private val gson: Gson
) : ISharePreferences {
}