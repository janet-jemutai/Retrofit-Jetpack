package com.jemutai.retrofit_jetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MyViewModel:ViewModel() {
     private  val _hse = MutableLiveData("House")
    val hse :LiveData<String>
        get() = _hse


    init {
        viewModelScope.launch {
            getHouse()
        }
    }

    }
    private suspend fun  getHouse(){


           RetrofitClient.wizardApiService.getHouses().toString()


    }
