package com.jaimelxpez.contentinfo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.jaimelxpez.domain.common.DataState
import com.jaimelxpez.domain.common.State
import com.jaimelxpez.domain.model.Show
import com.jaimelxpez.domain.usecase.GetShowsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getShowsUseCase: GetShowsUseCase
): BaseViewModel() {

    private var mutableShowList = MutableLiveData<List<Show>>()
    val showList: LiveData<List<Show>>
    get() = mutableShowList

    fun getShows(){
        getShowsUseCase().onEach { state ->
            when(state){
                is DataState.Loading -> {
                    sendState(State.LOADING)
                }
                is DataState.Success -> {
                    sendState(State.SUCCESS)
                    mutableShowList.postValue(state.data ?: listOf())
                }
                is DataState.Error -> {
                    sendState(State.ERROR)
                }
            }
        }.launchIn(viewModelScope)
    }
}