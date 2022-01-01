package com.example.viewmodel_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent()
    }

    /* Do not declare the fun as private because this function is declared in the xml file of the activity*/
    fun increment(view: View?) {
        counter++
        setContent()
    }

    private fun setContent() {
        tvCounter.text = counter.toString()
    }

}