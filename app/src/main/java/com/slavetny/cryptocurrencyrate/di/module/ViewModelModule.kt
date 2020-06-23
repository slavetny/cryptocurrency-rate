package com.slavetny.cryptocurrencyrate.di.module

import com.slavetny.cryptocurrencyrate.data.repository.CoinRepository
import com.slavetny.cryptocurrencyrate.presentation.screen.about.AboutViewModel
import com.slavetny.cryptocurrencyrate.presentation.screen.cryptocurrency.CryptocurrencyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { CryptocurrencyViewModel(get()) }
    viewModel { AboutViewModel() }
    single { CoinRepository(get()) }
}