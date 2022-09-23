package com.example.greetingcard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun Card(title : String, body : String, color : Color, modifier : Modifier){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp)){
        Text(text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
        Text(text = body, textAlign = TextAlign.Justify)
    }
}

@Composable
fun CardGrid(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            Card(title = "Text composable", body = "Displays text and follows Material Design guidelines.", color = Color.Green, modifier = Modifier.weight(1f))
            Card(title = "Image composable", body = "Creates a composable that lays out and draws a given Painter class object.", color = Color.Yellow, modifier = Modifier.weight(1f))
        }
        Row(modifier = Modifier.weight(1f)) {
            Card(title = "Row composable", body = "A layout composable that places its children in a horizontal sequence", color = Color.Cyan, modifier = Modifier.weight(1f))
            Card(title = "Column composable", body = "A layout composable that places its children in a vertical sequence.", color = Color.LightGray, modifier = Modifier.weight(1f))
        }
    }
}