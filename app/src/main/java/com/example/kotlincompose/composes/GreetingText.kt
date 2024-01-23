package com.example.kotlincompose.composes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GreetingText(name: String) {
    Text(
        text = "Hello $name!",
//        modifier = Modifier
//            .width(80.dp)
//            .height(240.dp)
//        modifier = Modifier
//            .size(width = 80.dp, height = 240.dp)
//        modifier = Modifier
//            .fillMaxSize()
//        modifier = Modifier
//            .fillMaxHeight()
//        modifier = Modifier
//            .fillMaxWidth()
//        modifier = Modifier
//            .fillMaxWidth(fraction = 0.50f)
        modifier = Modifier
            .wrapContentSize()
            .clickable { }
            .padding(24.dp),

        style = TextStyle(
            fontSize = 24.sp,
            color = Color.Blue,
            fontWeight = FontWeight.W600,
        ),
//        style = MaterialTheme.typography.labelLarge,
    )
}