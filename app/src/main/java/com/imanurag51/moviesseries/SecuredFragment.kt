package com.imanurag51.moviesseries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview

class SecuredFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

@Preview
@Composable
fun SecuredFile(){
    val State = rememberScaffoldState()
    Scaffold(backgroundColor = Color.Gray,
        topBar = {
            TopAppBar(title = {
                Text("Secured File",style = TextStyle(fontWeight = FontWeight.Bold,fontSize = 20.sp),
            modifier = Modifier.wrapContentSize(align = Alignment.Center))},
                navigationIcon = {
                    IconButton(onClick = {
                        State.drawerState.open()
                    }) {
                        Icon(Icons.Filled.Menu)
                    }
                },
                backgroundColor = MaterialTheme.colors.surface,
                elevation = 20.dp
            )
        },
        drawerContent = {
            Text("Hello World")
        },
        scaffoldState = State
    ) {
        ScrollableColumn() {
            repeat(times = 20){
                ScrollableRow() {
                    repeat(times = 2){
                        Card(
                            modifier = Modifier.height(200.dp).width(200.dp)
                                .padding(2.dp).clickable(onClick = {})
                        ) {

                        }
                    }
                }
            }
        }
    }
}