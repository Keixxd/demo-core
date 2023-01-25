package com.example.demo_core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.demo_core.app.FragmentNavigator
import com.example.demo_core.app.content.view.MainActivity

abstract class BaseFragment<T, VM: Any> : Fragment() {

    protected var binding: T? = null
    protected lateinit var viewModel: VM
        private set
    protected val fragmentNavigator: FragmentNavigator
        get() = (activity as MainActivity).fragmentNavigator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return createView(inflater, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        requestData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        clearViewModel()
    }

    protected open fun clearViewModel(){
        if (this::viewModel.isInitialized && viewModel is BaseViewModel<*>){
            (viewModel as BaseViewModel<*>).clearView()
        }
    }

    fun setViewModel(viewModel: VM){
        this.viewModel = viewModel
    }

    open fun initViewModel(){}

    open fun requestData(){}

    open fun initViews(view: View){}

    abstract fun getLayoutResource(): Int

    abstract fun createView(inflater: LayoutInflater, container: ViewGroup?) : View?

}