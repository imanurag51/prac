package com.imanurag51.moviesseries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPage()
        }
        }
    }

@Preview
@Composable
fun LoginPage(){
    Scaffold(backgroundColor = Color.Blue) {
        Card(modifier = Modifier.fillMaxSize(),backgroundColor = Color.Blue) {
            Text(text = "Login Page",style = TextStyle(color = Color.White),
                    modifier = Modifier.wrapContentSize(align = Alignment.Center))
        }
    }
}