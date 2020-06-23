package com.slavetny.cryptocurrencyrate.presentation.screen.about

import com.slavetny.cryptocurrencyrate.R
import com.slavetny.cryptocurrencyrate.presentation.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class AboutFragment : BaseFragment<AboutViewModel>(R.layout.fragment_about) {

    override val viewModel: AboutViewModel by viewModel()

}