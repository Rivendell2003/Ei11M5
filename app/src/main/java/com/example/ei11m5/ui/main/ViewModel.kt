package com.example.ei11m5.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _text = MutableLiveData<String>("Hello, World!")
    val text: LiveData<String> = _text

    // Método que se llama cuando se hace clic en el botón
    fun onButtonClicked() {
        _text.value = "Text Changed!"
    }
}
