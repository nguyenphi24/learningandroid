package com.tnpsw.learningandroid.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.tnpsw.learningandroid.common.autoCleared

/**
 * Created by tnphi on 10/3/2023.
 */
abstract class BaseVBFragment<VB : ViewBinding> : BaseFragment() {
    protected abstract val layoutId: Int
    protected var binding by autoCleared<VB>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.root
    }

}