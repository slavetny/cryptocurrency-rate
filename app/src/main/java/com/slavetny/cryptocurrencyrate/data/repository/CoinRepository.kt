package com.slavetny.cryptocurrencyrate.data.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.slavetny.cryptocurrencyrate.data.utils.Constants
import com.slavetny.cryptocurrencyrate.domain.model.Coin
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CoinRepository {

    private lateinit var retrofit: Retrofit
    private lateinit var coinService: CoinService
    private lateinit var coinList: MutableLiveData<Coin>
    private lateinit var coinRepository: CoinRepository

    fun getInstance(): CoinRepository {
        coinRepository = CoinRepository()

        return coinRepository
    }

    fun getCoinList() : MutableLiveData<Coin> {
        retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        coinList = MutableLiveData()

        coinService = retrofit.create(CoinService::class.java)

        val getCoinsList: Call<Coin> = coinService.getCoinList(Constants.API_KEY)
        getCoinsList.enqueue(object: Callback<Coin> {
            override fun onFailure(call: Call<Coin>, t: Throwable) {
                Log.d(Constants.COIN_REPOSITORY_TAG, t.message)
            }

            override fun onResponse(call: Call<Coin>, response: Response<Coin>) {
                coinList.value = response.body()
            }
        })

        return coinList
    }
}