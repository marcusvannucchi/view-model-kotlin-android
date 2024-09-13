package com.example.myapplication.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainviewmodel: ViewModel() {
   private val _contador = MutableLiveData<Int>(0)
    var contador = _contador

    fun incrementeContador(){
        _contador.value = _contador.value?.plus(1)
    }

}