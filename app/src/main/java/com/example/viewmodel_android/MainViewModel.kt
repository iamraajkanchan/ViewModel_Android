package com.example.viewmodel_android

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    /* Do not make the variable private because you have to use this variable in MainActivity */
    var counter: Int = 0;

    /* Do not make the function private because you have to use this function in MainActivity */
    fun increment() {
        counter++
    }

}