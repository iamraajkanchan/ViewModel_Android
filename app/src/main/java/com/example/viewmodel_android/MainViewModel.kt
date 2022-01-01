package com.example.viewmodel_android

import androidx.lifecycle.ViewModel

<<<<<<< Updated upstream
class MainViewModel : ViewModel() {

=======
class MainViewModel(private val initialValue: Int) : ViewModel() {
    /* Do not make the variable private because you have to use this variable in MainActivity */
    var counter: Int = initialValue;

    /* Do not make the function private because you have to use this function in MainActivity */
    fun increment() {
        counter++
    }
>>>>>>> Stashed changes
}