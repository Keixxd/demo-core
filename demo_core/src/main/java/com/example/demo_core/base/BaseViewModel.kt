package com.example.demo_core.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<T>(protected var view: T?) : ViewModel() {

    fun clearView(){
        view = null
    }

}