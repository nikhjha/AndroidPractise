package com.example.greetingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScoreCard(score : Int){
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Score", fontSize = 30.sp)
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "$score/4", fontSize = 50.sp, fontWeight = FontWeight.Bold)
}

@Composable
fun ChoicePanel(playerChoice : String, androidChoice : String){
    Spacer(modifier = Modifier.height(100.dp))
    Row(
        Modifier
            .fillMaxWidth()
            .padding(32.dp), horizontalArrangement = Arrangement.SpaceBetween){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "You Choose", fontSize = 16.sp)
            Text(text = playerChoice, fontWeight = FontWeight.Bold, fontSize = 32.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Android Choose", fontSize = 16.sp)
            Text(text = androidChoice, fontWeight = FontWeight.Bold, fontSize = 32.sp)
        }
    }
    Spacer(modifier = Modifier.height(100.dp))
}

@Composable
fun Choices(choose : (String) -> Unit){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Button(onClick = { choose("Rock") }, Modifier.size(100.dp), shape = RoundedCornerShape(20.dp)) {
            Text("Rock", color = Color.White)
        }
        Button(onClick = { choose("Paper") }, Modifier.size(100.dp), shape = RoundedCornerShape(20.dp)) {
            Text("Paper", color = Color.White)
        }
        Button(onClick = { choose("Scissors") }, Modifier.size(100.dp), shape = RoundedCornerShape(20.dp)) {
            Text("Scissors", color = Color.White)
        }
    }
}

fun wonRound(playerChoice: String, androidChoice: String) : Boolean {
    if(playerChoice == "Paper" && androidChoice == "Rock") {return true}
    if(playerChoice == "Rock" && androidChoice == "Scissors") {return true}
    if(playerChoice == "Scissors" && androidChoice == "Paper") {return true}
    return false
}

@Composable
fun RockPaperScissor(){
    var score by remember {
        mutableStateOf(0)
    }
    var playerChoice by remember{
        mutableStateOf("Rock")
    }
    var androidChoice by remember {
        mutableStateOf("Paper")
    }
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        val image = painterResource(id = R.drawable._109_w023_n001_998b_p1_998)
        Image(painter = image, contentDescription = null)
        ScoreCard(score)
        ChoicePanel(playerChoice, androidChoice)
        Choices{
            playerChoice = it
            androidChoice = listOf("Rock", "Paper", "Scissors").random()
            if(wonRound(playerChoice, androidChoice)){
                score = (score + 1)%4
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "#JetpackCompose", fontSize = 20.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun RockPaperScissorPreview(){
    RockPaperScissor()
}