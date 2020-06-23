package com.slavetny.cryptocurrencyrate.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.slavetny.cryptocurrencyrate.domain.model.Data
import kotlinx.android.synthetic.main.coin_item.view.*

class CryptocurrencyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(data: Data) {
        itemView.cryptocurrency_name.text = data.name
        itemView.cryptocurrency_price.text = data.quote.USD.price.toString() + "$"

        Glide.with(itemView.context)
            .load("https://s2.coinmarketcap.com/static/img/coins/64x64/" + data.id.toInt() + ".png")
            .into(itemView.cryptocurrency_logo)
    }
}