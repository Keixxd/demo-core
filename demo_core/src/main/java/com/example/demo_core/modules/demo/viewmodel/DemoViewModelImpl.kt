package com.example.demo_core.modules.demo.viewmodel

import com.example.demo_core.base.BaseViewModel
import com.example.demo_core.modules.demo.model.repo.DemoFragmentRepository
import com.example.demo_core.modules.demo.view.DemoFragmentView

class DemoViewModelImpl(
    view: DemoFragmentView?,
    private val repository: DemoFragmentRepository
) : BaseViewModel<DemoFragmentView>(view), DemoViewModel {

    override fun fetchData() {
        repository.sendRequest()
    }

}