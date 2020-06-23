package com.slavetny.cryptocurrencyrate.presentation.screen.cryptocurrency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.slavetny.cryptocurrencyrate.data.repository.CoinRepository
import com.slavetny.cryptocurrencyrate.domain.model.Coin
import com.slavetny.cryptocurrencyrate.presentation.base.BaseViewModel

class CryptocurrencyViewModel : BaseViewModel() {

    private var coinList: MutableLiveData<Coin> = MutableLiveData()
    private val coinRepository: CoinRepository

    init {
        coinRepository = CoinRepository().getInstance()
        coinList = coinRepository.getCoinList()
    }

    fun getCoinList() : LiveData<Coin> {
        return coinList
    }
}