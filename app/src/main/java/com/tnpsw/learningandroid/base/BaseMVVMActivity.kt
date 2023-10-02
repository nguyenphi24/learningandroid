package com.tnpsw.learningandroid.base

import androidx.viewbinding.ViewBinding

/**
 * Created by tnphi on 10/3/2023.
 */
abstract class BaseMVVMActivity<VB : ViewBinding, VM : BaseViewModel> : BaseVBActivity<VB>() {
    protected abstract val viewModel: VM
}