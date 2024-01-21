package com.example.kotlincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    Surface(
        color = Color.Gray,
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Row(
                modifier = Modifier
                    .wrapContentSize(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                ItemTextWithBgColor(bgColor = Color.Magenta, text = "Text 1")
                ItemTextWithBgColor(bgColor = Color.Blue, text = "Text 2")
            }

            Column(
                modifier = Modifier
                    .wrapContentSize(),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                ItemTextWithBgColor(bgColor = Color.Magenta, text = "Text 1")
                ItemTextWithBgColor(bgColor = Color.Blue, text = "Text 2")
            }
        }


    }
}

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
            .size(width = 200.dp, height = 240.dp)
            .clickable { }
            .padding(24.dp),

//        style = TextStyle(
//            fontSize = 24.sp,
//            color = Color.Blue,
//            fontWeight = FontWeight.W600,
//        )
        style = MaterialTheme.typography.labelMedium,
    )
}

@Composable
fun GreetingButton(){
    Button(onClick = {

    }) {
        GreetingText(name = "Button")
    }
}

@Composable
fun ItemTextWithBgColor(bgColor: Color,text: String){
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


@Preview(showBackground = true)
@Composable
fun PreviewPage() {
    MainScreen()
}