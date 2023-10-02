package com.tnpsw.learningandroid.ui.main

import androidx.lifecycle.viewModelScope
import com.tnpsw.learningandroid.base.BaseViewModel
import com.tnpsw.learningandroid.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by tnphi on 12/08/2023.
 */

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : BaseViewModel() {
    fun fetch() {
        viewModelScope.launch {
            mainRepository.fetch()
                .catch {

                }.collect {

                }
        }
    }
}