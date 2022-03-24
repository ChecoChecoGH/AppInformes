package com.example.appinformes.ui.enviados

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EnviadosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is enviados Fragment"
    }
    val text: LiveData<String> = _text
}