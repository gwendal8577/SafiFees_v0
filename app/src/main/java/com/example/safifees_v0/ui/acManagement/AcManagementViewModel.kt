package com.example.safifees_v0.ui.acManagement

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AcManagementViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Il s'agit la fenetre de gestion des AC"
    }
    val text: LiveData<String> = _text
}