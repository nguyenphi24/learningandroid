package com.tnpsw.learningandroid.extensions

import java.text.SimpleDateFormat
import java.util.Locale

/**
 * Created by tnphi on 10/3/2023.
 */


fun String.toDateTimeFormat(): SimpleDateFormat {
    return SimpleDateFormat(this, Locale.getDefault())
}