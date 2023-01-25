package com.example.demo_core.app.content.view

import android.os.Bundle
import com.example.demo_core.R
import com.example.demo_core.app.FragmentNavigator
import com.example.demo_core.base.BaseActivity
import com.example.demo_core.modules.demo.view.DemoFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    lateinit var fragmentNavigator: FragmentNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        fragmentNavigator = FragmentNavigator(this, this.supportFragmentManager)
        fragmentNavigator.changeFragment(DemoFragment(), false)
    }

}