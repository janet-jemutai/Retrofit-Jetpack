package com.jemutai.retrofit_jetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
     private  val _hse = MutableLiveData<House>()
    val hse = LiveData<House>
        get() = _hse
}