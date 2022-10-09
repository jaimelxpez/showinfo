package com.jaimelxpez.contentinfo.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.jaimelxpez.contentinfo.databinding.FragmentMainBinding
import com.jaimelxpez.contentinfo.ui.base.BaseFragment
import com.jaimelxpez.contentinfo.viewmodel.MainViewModel
import com.jaimelxpez.domain.common.State
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment: BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    private val viewModel: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getShows()
    }

    override fun observers() {
        viewModel.state.observe(this, Observer { state ->
            when(state){
                State.LOADING -> {
                    binding.progressBar.isVisible = true
                }
                State.SUCCESS -> {
                    binding.progressBar.isVisible = false
                }
                State.ERROR -> {
                    binding.progressBar.isVisible = false
                }
                else -> {

                }
            }
        })
        viewModel.showList.observe(this, Observer { list ->
            Toast.makeText(requireContext(), "List size: ${list.size}", Toast.LENGTH_SHORT).show()
        })
    }

    override fun listeners() {

    }



}