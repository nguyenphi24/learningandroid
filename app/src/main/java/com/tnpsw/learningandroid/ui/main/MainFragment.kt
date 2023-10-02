package com.tnpsw.learningandroid.ui.main

import androidx.fragment.app.viewModels
import com.tnpsw.learningandroid.R
import com.tnpsw.learningandroid.base.BaseMVVMFragment
import com.tnpsw.learningandroid.databinding.FragmentMainBinding

/**
 * Created by tnphi on 10/3/2023.
 */
class MainFragment : BaseMVVMFragment<FragmentMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModels()

    override val layoutId: Int
        get() = R.layout.fragment_main
}