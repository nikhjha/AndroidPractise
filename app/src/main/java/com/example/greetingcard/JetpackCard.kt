package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JetpackCard(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight().padding(vertical = 32.dp), verticalArrangement = Arrangement.spacedBy(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        val image = painterResource(id = R.drawable.jetpack_compose_icon_rgb)
        Image(painter = image, contentDescription = null)
        Text("Nikhil Jha", modifier = Modifier.padding(bottom = 8.dp), fontSize = 30.sp, color = Color(56,112,179,255), fontWeight = FontWeight.Bold)
        Text("❤️", modifier = Modifier.padding(bottom = 8.dp), fontSize = 60.sp, color = Color.Red)
        Text("Jetpack Compose", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color(8,48,66,255))
    }
}
