package com.tnpsw.learningandroid.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding

/**
 * Created by tnphi on 10/3/2023.
 */
abstract class BaseVBActivity<VB : ViewBinding> : BaseActivity() {
    protected abstract val layoutId: Int
    protected lateinit var binding: VB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}