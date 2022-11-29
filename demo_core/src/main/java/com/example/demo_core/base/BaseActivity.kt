package com.example.demo_core.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo_core.app.CoreApp

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoreApp.currentActivity = this
    }

    override fun onStop() {
        super.onStop()
        CoreApp.currentActivity = null
    }

}