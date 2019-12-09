package com.example.safifees_v0.ui.homeFront

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeFrontViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "il s'agit du tableau de bord front office"
    }
    val text: LiveData<String> = _text
}