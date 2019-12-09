package com.example.safifees_v0.ui.addFees

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddFeesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Il s'agit de la page d'ajout de frais"
    }
    val text: LiveData<String> = _text
}