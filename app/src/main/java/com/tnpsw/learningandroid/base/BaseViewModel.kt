package com.tnpsw.learningandroid.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tnpsw.learningandroid.helper.ThrowableWithRetryFunc

/**
 * Created by tnphi on 10/3/2023.
 */
open class BaseViewModel : ViewModel() {
    protected val _throwable = MutableLiveData<ThrowableWithRetryFunc>()
    val throwable: LiveData<ThrowableWithRetryFunc> = _throwable
}