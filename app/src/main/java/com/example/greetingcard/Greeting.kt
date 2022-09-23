package com.example.greetingcard

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta){
        Text("Hello! I am $name!", modifier = Modifier.padding(12.dp))
    }
}