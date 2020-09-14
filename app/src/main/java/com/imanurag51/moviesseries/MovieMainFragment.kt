package com.imanurag51.moviesseries

import android.os.Bundle
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.fragment.app.Fragment
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
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

class MovieMainFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

@Composable
fun MovieMain(){
    val State = rememberScaffoldState()
    Scaffold(
        backgroundColor = Color.Gray,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Movies", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp),
                        modifier = Modifier.wrapContentSize(align = Alignment.Center)
                    )
                },
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
            Column() {
                Text(text = "Movies",modifier = Modifier
                    .border(4.dp,color = Color.Cyan))
                Text(text = "Series")
                Text(text = "Secured File")
            }
        },
        scaffoldState = State
    ) {
        ScrollableColumn {
            Surface(color = Color.Transparent,modifier = Modifier.fillMaxWidth().height(50.dp)
                .padding(5.dp).clickable(onClick ={})
                .border(5.dp,color = Color.Magenta,shape = CircleShape),

                ) {
                Text(text = "Hollywood Movies",style = TextStyle(
                    color = Color.White,fontSize = 20.sp,fontWeight = FontWeight.Bold),
                    modifier = Modifier.wrapContentSize(align = Alignment.Center))
            }
            ScrollableRow() {
                repeat(times = 20){
                    Surface(
                        modifier = Modifier.height(200.dp).width(200.dp).padding(2.dp)
                            .clickable(onClick = {})){
                        Stack() {
//                            TODO image ko surface ki size me fill karna
                            Image(asset = imageResource(id = R.drawable.img))
                            Column(modifier = Modifier.gravity(align = Alignment.BottomStart)) {
                                ScrollableRow() {
                                    Text(text = "Movie Name",
                                        style = TextStyle(color = Color.Red,
                                            fontWeight = FontWeight.Bold,fontSize = 20.sp))
                                }
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                            }
                        }
                    }
                }
            }
            Surface(color = Color.Transparent,modifier = Modifier.fillMaxWidth().height(50.dp)
                .padding(5.dp).clickable(onClick ={}).border(5.dp,
                    color = Color.Magenta,shape = CircleShape),
            ) {
                Text(text = "Bollywood Movies",style = TextStyle(
                    color = Color.White,fontSize = 20.sp,fontWeight = FontWeight.Bold),
                    modifier = Modifier.wrapContentSize(align = Alignment.Center))
            }
            ScrollableRow() {
                repeat(times = 20){
                    Surface(
                        modifier = Modifier.height(200.dp).width(200.dp).padding(2.dp)
                            .clickable(onClick = {})){
                        Stack() {
//                            TODO image problem
//                            Image(asset = imageResource(id = R.drawable.img))
                            Column(modifier = Modifier.gravity(align = Alignment.BottomStart)) {
                                ScrollableRow() {
                                    Text(text = "Movie Name",
                                        style = TextStyle(color = Color.Red,
                                            fontWeight = FontWeight.Bold,fontSize = 20.sp))
                                }
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                            }
                        }
                    }
                }
            }
            Surface(color = Color.Transparent,modifier = Modifier.fillMaxWidth().height(50.dp)
                .padding(5.dp).clickable(onClick ={}).border(5.dp,
                    color = Color.Magenta,shape = CircleShape),
            ) {
                Text(text = "South Movies",style = TextStyle(
                    color = Color.White,fontSize = 20.sp,fontWeight = FontWeight.Bold),
                    modifier = Modifier.wrapContentSize(align = Alignment.Center))
            }
            ScrollableRow() {
                repeat(times = 20){
                    Surface(
                        modifier = Modifier.height(200.dp).width(200.dp).padding(2.dp)
                            .clickable(onClick = {})){
                        Stack() {
//                            TODO image problem
//                            Image(asset = imageResource(id = R.drawable.img))
                            Column(modifier = Modifier.gravity(align = Alignment.BottomStart)) {
                                ScrollableRow() {
                                    Text(text = "Movie Name",
                                        style = TextStyle(color = Color.Red,
                                            fontWeight = FontWeight.Bold,fontSize = 20.sp))
                                }
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                                Text(text = "Hello",style = TextStyle(color = Color.Red))
                            }
                        }
                    }
                }
            }
        }
    }
}