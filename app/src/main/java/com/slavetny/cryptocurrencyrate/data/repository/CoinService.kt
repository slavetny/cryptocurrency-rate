package com.slavetny.cryptocurrencyrate.data.repository

import com.slavetny.cryptocurrencyrate.domain.model.Coin
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinService {

    @GET("v1/cryptocurrency/listings/latest")
    fun getCoinList(@Query("CMC_PRO_API_KEY") apiKey: String) : Call<Coin>

}