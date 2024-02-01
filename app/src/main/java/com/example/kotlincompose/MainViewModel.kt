package com.example.kotlincompose

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class MainViewModel: ViewModel() {
    private var _textFieldState: MutableStateFlow<String> = MutableStateFlow("")
    val textFieldState: StateFlow<String>  = _textFieldState.asStateFlow()

    fun onTextChanged(newText: String){
        _textFieldState.value = newText
    }
}