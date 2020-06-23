package com.slavetny.cryptocurrencyrate.data.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.slavetny.cryptocurrencyrate.data.utils.constants.Constants
import com.slavetny.cryptocurrencyrate.domain.model.Coin
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CoinRepository(private val coinService: CoinService) {

    private val coinList: MutableLiveData<Coin> = MutableLiveData()

    fun getCoinList() : MutableLiveData<Coin> {
        val getCoinsList: Call<Coin> = coinService.getCoinList(Constants.API_KEY)
        getCoinsList.enqueue(object: Callback<Coin> {
            override fun onFailure(call: Call<Coin>, t: Throwable) {
                Log.d(Constants.COIN_REPOSITORY_TAG, t.message!!)
            }

            override fun onResponse(call: Call<Coin>, response: Response<Coin>) {
                coinList.value = response.body()
            }
        })

        return coinList
    }
}