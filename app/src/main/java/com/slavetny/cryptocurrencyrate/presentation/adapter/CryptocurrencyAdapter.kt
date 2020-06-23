package com.slavetny.cryptocurrencyrate.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.slavetny.cryptocurrencyrate.R
import com.slavetny.cryptocurrencyrate.data.utils.inflate
import com.slavetny.cryptocurrencyrate.domain.model.Coin

class CryptocurrencyAdapter(var coin: Coin) : RecyclerView.Adapter<CryptocurrencyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptocurrencyViewHolder =
        CryptocurrencyViewHolder(parent.inflate(R.layout.coin_item))

    override fun getItemCount(): Int = coin.data.size

    override fun onBindViewHolder(holder: CryptocurrencyViewHolder, position: Int) {
        holder.bind(coin.data.get(position))
    }
}