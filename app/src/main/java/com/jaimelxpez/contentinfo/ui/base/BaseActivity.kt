package com.jaimelxpez.contentinfo.ui.base

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B: ViewBinding>: FragmentActivity() {

    lateinit var binding: B

    protected abstract fun getViewBinding(): B
    protected open fun observers() {}
    protected open fun listeners() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)
        observers()
        listeners()
    }

}