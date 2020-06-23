package com.slavetny.cryptocurrencyrate.data.extension

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.slavetny.cryptocurrencyrate.R

fun ViewGroup.inflate(layoutRes: Int) =
    LayoutInflater.from(context).inflate(layoutRes,this, false)