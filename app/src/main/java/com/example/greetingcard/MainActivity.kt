package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    RockPaperScissor()
                }
            }
        }
    }
}

@Composable
fun TipCalculator(){
    var inputAmount by remember{
        mutableStateOf("")
    }
    val amount = inputAmount.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount)
    Column(Modifier.padding(32.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Calculate Tip", fontWeight = FontWeight.Bold, fontSize = 32.sp)
        Spacer(modifier = Modifier.height(32.dp))
        EditableTextField(inputAmount) { inputAmount = it }
        Spacer(modifier = Modifier.height(32.dp))
        Text("Tip Amount: $tip", fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}

@VisibleForTesting
internal fun calculateTip(amount : Double, percent : Int = 15, round : Boolean = false) : Double {
    return if (round) Math.ceil(amount * percent / 100)  else amount * percent / 100
}

@Composable
fun EditableTextField(value : String, onChange : (String) -> Unit){
    TextField(value = value, onValueChange = onChange, singleLine = true, label = { 
        Text(text = "Bill Amount")
    })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        TipCalculator()    }
}