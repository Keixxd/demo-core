package com.example.demo

import com.example.demo_core.app.CoreApp
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : CoreApp() {

    override fun onCreate() {
        super.onCreate()

    }

}