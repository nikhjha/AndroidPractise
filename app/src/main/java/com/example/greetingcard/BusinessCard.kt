package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BusinessCard(){
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF018786))
            .padding(16.dp)) {
        Column(modifier = Modifier
            .weight(3f)
            .fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            val image = painterResource(id = R.drawable.android_logo)
            Image(painter = image, contentDescription = "Android Logo",
                Modifier
                    .width(150.dp)
                    .height(150.dp))
            Text(text = "Nikhil Jha", fontSize = 48.sp, fontWeight = FontWeight.Bold, color = Color.White)
            Text("Android Developer Extraordinaire", fontSize = 20.sp, color = Color(0xFF3ddc84), fontWeight = FontWeight.Bold)
        }
        Column(
            Modifier
                .weight(1f)
                .fillMaxSize()) {
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Gray))
            Row(Modifier.padding(start = 16.dp, end=16.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.Call, contentDescription = "Phone no", tint = Color(0xFF3ddc84), modifier = Modifier.padding(16.dp).size(30.dp))
                Text(text = "(+91) 8329310778", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Gray))
            Row(Modifier.padding(start = 16.dp, end=16.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.Share, contentDescription = "Username", tint = Color(0xFF3ddc84), modifier = Modifier.padding(16.dp).size(30.dp))
                Text(text = "@nikhjha", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Gray))
            Row(Modifier.padding(start = 16.dp, end=16.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.Email, contentDescription = "Email", tint = Color(0xFF3ddc84), modifier = Modifier.padding(16.dp).size(30.dp))
                Text(text = "nikh.jha550@gmail.com", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
        }
    }
}