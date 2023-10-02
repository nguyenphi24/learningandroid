package com.tnpsw.learningandroid.helper

/**
 * Created by tnphi on 10/3/2023.
 */
class ThrowableWithRetryFunc(
    val throwable: Throwable?,
    val retry: () -> Unit
)