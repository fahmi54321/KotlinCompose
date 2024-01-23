package com.example.kotlincompose.composes

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable

@Composable
fun GreetingButton(){
    Button(onClick = {

    }) {
        GreetingText(name = "Button")
    }
}