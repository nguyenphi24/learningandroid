package com.tnpsw.learningandroid.ui.main

import com.tnpsw.learningandroid.R
import com.tnpsw.learningandroid.base.BaseVBActivity
import com.tnpsw.learningandroid.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseVBActivity<ActivityMainBinding>() {
    override val layoutId: Int
        get() = R.layout.activity_main


}