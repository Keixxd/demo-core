package com.example.demo_core.modules.demo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.demo_core.R
import com.example.demo_core.base.BaseFragment
import com.example.demo_core.databinding.DemoFragmentBinding
import com.example.demo_core.modules.demo.viewmodel.DemoViewModel
import com.example.demo_core.modules.demo2.SecondDemoFragment

class DemoFragment : BaseFragment<DemoFragmentBinding, DemoViewModel>(), DemoFragmentView {

    override fun getLayoutResource() = R.layout.demo_fragment

    override fun createView(inflater: LayoutInflater, container: ViewGroup?): View {
        if (binding == null){
            binding = DemoFragmentBinding.inflate(inflater, container, false)
        }
        return (binding as DemoFragmentBinding).root
    }

    override fun initViews(view: View) {
        super.initViews(view)
        binding?.let {
            it.button.setOnClickListener {
                fragmentNavigator.changeFragment(SecondDemoFragment())
            }
        }
    }

    override fun showErrorDialog() {
        Toast.makeText(requireContext(), "nigga", Toast.LENGTH_LONG).show()
    }
}