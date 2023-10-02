package com.tnpsw.learningandroid.base

import androidx.viewbinding.ViewBinding

/**
 * Created by tnphi on 10/3/2023.
 */
abstract class BaseMVVMFragment<VB: ViewBinding, VM: BaseViewModel>: BaseVBFragment<VB>() {
    protected abstract val viewModel: VM
}