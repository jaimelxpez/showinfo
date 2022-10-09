package com.jaimelxpez.contentinfo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jaimelxpez.domain.common.State

open class BaseViewModel: ViewModel() {

    private val mutableState = MutableLiveData<State>()
    val state: LiveData<State>
        get() = mutableState

    fun sendState(state: State){
        mutableState.postValue(state)
    }

}