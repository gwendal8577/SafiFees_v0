package com.example.safifees_v0.ui.sheetToProceed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SheetToProceedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "il s'agit des fiches a traiter"
    }
    val text: LiveData<String> = _text
}
