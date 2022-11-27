package com.example.hakathon2022.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hakathon2022.R
import com.example.hakathon2022.ui.common.CommonText

@Composable
fun sheduleScreen(navController: NavController) {
    Box(modifier = Modifier.background(
        brush = Brush.verticalGradient(
            colors = listOf(
                MaterialTheme.colors.salatGreen,
                MaterialTheme.colors.darkGreen,
                MaterialTheme.colors.blue,
                MaterialTheme.colors.darkBlue
            )
        )
    ).fillMaxSize()
    )
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painterResource(id = R.drawable.shedule),
            contentDescription = "shedule",
            modifier = Modifier.height(570.dp).padding(top = 30.dp),
            contentScale = ContentScale.FillHeight
        )

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
                CommonText(text = "Посетить лекцию", color = Color(0xFF403EFD), fontSize = 18.sp)
            })
    }
}