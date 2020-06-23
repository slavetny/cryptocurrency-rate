package com.slavetny.cryptocurrencyrate.di.module

import com.slavetny.cryptocurrencyrate.data.repository.CoinService
import com.slavetny.cryptocurrencyrate.data.utils.constants.Constants
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single { provideDefaultOkhttpClient() }
    single { provideRetrofit(get()) }
    single { provideCoinService(get()) }
}

fun provideDefaultOkhttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .build()
}

fun provideRetrofit(client: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun provideCoinService(retrofit: Retrofit):
        CoinService = retrofit.create(CoinService::class.java)