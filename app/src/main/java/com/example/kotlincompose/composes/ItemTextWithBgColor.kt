package com.example.kotlincompose.composes

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ItemTextWithBgColor(bgColor: Color, text: String){
    Surface(
        color = bgColor,
        modifier = Modifier.wrapContentSize(
            align = Alignment.TopCenter,
        ),

        ) {
        Text(
            text,
            style = MaterialTheme.typography.titleLarge,
            color = Color.Black,
        )
    }
}