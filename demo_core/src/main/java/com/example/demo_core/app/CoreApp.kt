package com.example.demo_core.app

import android.app.Activity
import android.app.Application
import android.content.Context

open class CoreApp : Application() {

    companion object{
        lateinit var appContext: Context
        var PACKAGE_NAME: String? = null
        var currentActivity: Activity? = null

    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        PACKAGE_NAME = packageName
    }

    fun initCore(){

    }

}