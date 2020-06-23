package com.slavetny.cryptocurrencyrate.data.repository

import com.slavetny.cryptocurrencyrate.data.utils.constants.Constants
import com.slavetny.cryptocurrencyrate.domain.model.Coin
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinService {

    @GET(Constants.GET_LIST_OF_CRYPTOCURRENCY)
    fun getCoinList(@Query(Constants.QUERY_API_KEY) apiKey: String) : Call<Coin>

}