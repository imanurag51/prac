package com.imanurag51.moviesseries

import android.os.Bundle
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.fragment.app.Fragment
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview

class MovieDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

@Preview
@Composable
fun MovieDetails(){
    val State = rememberScaffoldState()
    Scaffold(backgroundColor = Color.Gray,
            topBar = {
                TopAppBar(title = {
                    Text("Movie Details",style = TextStyle(fontWeight = FontWeight.Bold,fontSize = 20.sp),
                            modifier = Modifier.wrapContentSize(align = Alignment.Center))},
                        navigationIcon = {
                            IconButton(onClick = {
                                State.drawerState.open()
                            }) {
                                Icon(Icons.Filled.ArrowBack)
                            }
                        },
                        backgroundColor = MaterialTheme.colors.surface,
                        elevation = 20.dp
                )
            },
            scaffoldState = State
            ) {
        Column() {
            Card(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.6f),
                    shape = RoundedCornerShape(30.dp).copy(topLeft = ZeroCornerSize,topRight = ZeroCornerSize)) {
                Image(asset = imageResource(id = R.drawable.img))
            }
            Text(text = "Movie Name",modifier = Modifier.padding(top = 5.dp,start = 5.dp),
                    style = TextStyle(fontSize = 20.sp,fontWeight = FontWeight.Bold))
            Text(text = "Year",modifier = Modifier.padding(start = 5.dp))
            Text(text = "123 Min",modifier = Modifier.padding(start = 5.dp))
            ScrollableColumn() {
                Text(text = "Summery",modifier = Modifier.padding(start = 5.dp))
            }
        }
    }
}