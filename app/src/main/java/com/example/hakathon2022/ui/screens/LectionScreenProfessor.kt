package com.example.hakathon2022.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.hakathon2022.models.Lection
import com.example.hakathon2022.ui.common.CommonText

@Composable
fun lectionScreenProfessor(lection: Lection){
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        CommonText(text = "Лекция идёт")
        if (lection.type == "Offline") {
            Button(modifier = Modifier.padding(top = 16.dp),
                onClick = {/*Отправить локацию препода на сервер, оповестить всех студентов группы об отметке*/ },
                content = {
                    CommonText(text = "Начать отметку", color = Color.White)
                })
        }
        else {
            Button(modifier = Modifier.padding(top = 16.dp),
                onClick = {/*Начать тест у студентов группы*/ },
                content = {
                    CommonText(text = "Начать тест", color = Color.White)
                })
        }
    }
}