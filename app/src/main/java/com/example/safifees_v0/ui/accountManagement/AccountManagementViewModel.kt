package com.example.safifees_v0.ui.accountManagement

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccountManagementViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Il s'agit de la fenetre de gestion des comptes"
    }
    val text: LiveData<String> = _text
}