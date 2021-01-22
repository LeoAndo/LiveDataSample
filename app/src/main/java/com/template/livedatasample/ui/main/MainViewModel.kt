package com.template.livedatasample.ui.main

import android.icu.text.NumberFormat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _price = MutableLiveData<Int>()
    val price: LiveData<String> = Transformations.map(_price, {
        NumberFormat.getCurrencyInstance().format(it)
    })

    init {
        _price.value = 1000
    }
}