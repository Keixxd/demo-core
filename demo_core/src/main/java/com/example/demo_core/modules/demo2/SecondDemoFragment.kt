package com.example.demo_core.modules.demo2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demo_core.R
import com.example.demo_core.base.BaseFragment
import com.example.demo_core.databinding.SecondDemoFragmentBinding
import com.example.demo_core.modules.demo.view.DemoFragment
import com.example.demo_core.modules.demo.view.DemoFragmentView

class SecondDemoFragment : BaseFragment<SecondDemoFragmentBinding, Any>() {

    override fun getLayoutResource() = R.layout.second_demo_fragment

    override fun createView(inflater: LayoutInflater, container: ViewGroup?): View? {
        if(binding == null){
            binding = SecondDemoFragmentBinding.inflate(inflater, container, false)
        }
        return binding?.root
    }

    override fun initViews(view: View) {
        binding?.let {
            it.button.setOnClickListener {
                fragmentNavigator.changeFragment(DemoFragment())
            }
        }
    }
}