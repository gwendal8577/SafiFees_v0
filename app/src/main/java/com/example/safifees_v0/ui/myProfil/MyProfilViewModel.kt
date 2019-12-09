package com.example.safifees_v0.ui.myProfil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyProfilViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Il s'agit du profil"
    }
    val text: LiveData<String> = _text
}