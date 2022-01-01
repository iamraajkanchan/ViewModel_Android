package com.example.viewmodel_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setContent()
    }

    /* Do not declare the fun as private because this function is declared in the xml file of MainActivity*/
    fun increment(view: View?) {
        mainViewModel.increment()
        setContent()
    }

    private fun setContent() {
        tvCounter.text = mainViewModel.counter.toString()
    }

}