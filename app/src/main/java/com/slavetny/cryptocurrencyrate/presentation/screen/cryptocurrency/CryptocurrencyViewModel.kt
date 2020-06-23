package com.slavetny.cryptocurrencyrate.presentation.screen.cryptocurrency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.slavetny.cryptocurrencyrate.data.repository.CoinRepository
import com.slavetny.cryptocurrencyrate.domain.model.Coin
import com.slavetny.cryptocurrencyrate.presentation.base.BaseViewModel

class CryptocurrencyViewModel(
    coinRepository: CoinRepository
) : BaseViewModel() {

    private var _coinList: MutableLiveData<Coin> = MutableLiveData()
    val coinList: LiveData<Coin> get() = _coinList

    init {
        _coinList = coinRepository.getCoinList()
    }
}