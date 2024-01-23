package com.example.kotlincompose.composes

import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreetingList(
    list: List<String>,
    btnClick: () -> Unit,
    textInput: String,
    textChanged: (String) -> Unit,
){
    for( name in list){
        GreetingText(name = name)
    }


    TextField(value = textInput, onValueChange = textChanged)

    Button(onClick = btnClick
    ) {
        Text("Add new name")
    }
}