package com.example.demo_core.app

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.demo_core.R

class FragmentNavigator(activity: Activity, fragmentManager: FragmentManager) {

    private val fragmentManager: FragmentManager
    private val app: CoreApp
    private val activity: Activity

    init {
        this.fragmentManager = fragmentManager
        this.activity = activity
        this.app = activity.applicationContext as CoreApp
    }

    fun changeFragment(fragment: Fragment, backstack: Boolean = true){
        if (backstack){
            fragmentManager.beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                .addToBackStack(fragment.javaClass.name)
                .replace(R.id.content_frame, fragment, fragment.javaClass.name)
                .commitAllowingStateLoss()

        }else{
            fragmentManager.beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                .replace(R.id.content_frame, fragment, fragment.javaClass.name)
                .commitAllowingStateLoss()
        }
    }
}