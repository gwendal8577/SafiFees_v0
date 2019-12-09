package com.example.safifees_v0.ui.homeBack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeBackViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "il s'agit du tableau de bord back office"
    }
    val text: LiveData<String> = _text
}