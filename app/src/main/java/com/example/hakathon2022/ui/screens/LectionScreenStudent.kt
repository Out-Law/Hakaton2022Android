package com.example.hakathon2022.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hakathon2022.ui.common.CommonText

@Composable
fun lectionScreenStudent() {
    var answerOne = remember { mutableStateOf("") }
    var answerTwo = remember { mutableStateOf("") }
    Box(modifier = Modifier
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    MaterialTheme.colors.salatGreen,
                    MaterialTheme.colors.darkGreen,
                    MaterialTheme.colors.blue,
                    MaterialTheme.colors.darkBlue
                )
            )
        )
        .fillMaxSize()
    )
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.padding(top = 48.dp))
        Text(text = "Администрирование и безопасность сетей", fontSize = 22.sp,color = Color.White, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.padding(32.dp))
        Box(modifier = Modifier
            .background(Color.White, shape = RoundedCornerShape(20.dp))
            .width(330.dp)
            .padding(all = 20.dp)) {
            Column(){
                CommonText(text = "Тест по лекции 1:", fontSize = 20.sp)
                CommonText(text = "1. Что представляет собой локальная сеть?", fontSize = 16.sp)
                OutlinedTextField(modifier = Modifier
                    .padding(top = 8.dp)
                    .padding(bottom = 16.dp), value = answerOne.value, placeholder = { CommonText(text = "Ваш ответ", color = Color.Gray) }, shape = RoundedCornerShape(15.dp),
                    onValueChange = { newText ->
                        answerOne.value = newText
                    })
                CommonText(text = "2. Как работает оптическое волокно?", fontSize = 16.sp)
                OutlinedTextField(modifier = Modifier.padding(top = 8.dp), value = answerTwo.value, placeholder = { CommonText(text = "Ваш ответ", color = Color.Gray) }, shape = RoundedCornerShape(15.dp),
                    onValueChange = { newText ->
                        answerTwo.value = newText
                    })
            }
        }
        Button(modifier = Modifier
            .padding(top = 40.dp)
            .width(270.dp)
            .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp),
            onClick = {/*Начать тест у студентов группы*/ },
            content = {
                CommonText(text = "Отметиться по QR", color = Color(0xFF403EFD), fontSize = 18.sp)
            })

        Button(modifier = Modifier
            .padding(top = 20.dp)
            .width(270.dp)
            .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp),
            onClick = {/*Начать тест у студентов группы*/ },
            content = {
                CommonText(text = "Отметиться по GPS", color = Color(0xFF403EFD), fontSize = 18.sp)
            })

        Button(modifier = Modifier
            .padding(top = 40.dp)
            .width(270.dp)
            .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.salatGreen
            ),
            shape = RoundedCornerShape(10.dp),
            onClick = {/*Начать тест у студентов группы*/ },
            content = {
                CommonText(text = "Сгенерировать QR", color = Color.Black, fontSize = 18.sp)
            })
    }
}