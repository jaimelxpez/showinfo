package com.jaimelxpez.contentinfo.ui.main

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.jaimelxpez.contentinfo.R
import com.jaimelxpez.contentinfo.databinding.ActivityMainBinding
import com.jaimelxpez.contentinfo.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private val navHost by lazy {
        supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
    }

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun observers() {

    }

    override fun listeners() {

    }
}