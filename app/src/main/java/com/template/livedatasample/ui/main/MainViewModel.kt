package com.template.livedatasample.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _price = MutableLiveData<Int>()
    val price: LiveData<Int> = _price

    init {
        _price.value = 1000
    }
}