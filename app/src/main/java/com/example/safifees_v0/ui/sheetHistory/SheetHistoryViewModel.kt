package com.example.safifees_v0.ui.sheetHistory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SheetHistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Il s'agit de l'historique des fiches"
    }
    val text: LiveData<String> = _text
}