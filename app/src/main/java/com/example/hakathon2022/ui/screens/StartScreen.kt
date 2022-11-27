package com.example.hakathon2022.ui.screens

import androidx.compose.foundation.layout.Box
import android.graphics.drawable.BitmapDrawable
import android.provider.CalendarContract
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hakathon2022.R
import com.example.hakathon2022.ui.common.CommonText
import java.lang.Math.PI
import java.lang.Math.sqrt
import kotlin.math.pow

@Composable
fun startScreen(navController: NavController) {
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
    Box(
        contentAlignment = Alignment.BottomCenter, modifier = Modifier.padding(top = 200.dp)
    ) {
        Image(
            painterResource(id = R.drawable.back),
            contentDescription = "fuck",
            modifier = Modifier.fillMaxSize()
        )
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .padding(top = 64.dp)
            .fillMaxSize()
    ) {
        Row {
            Image(
                painterResource(id = R.drawable.sfedu),
                "content"
            )

            Image(
                painterResource(id = R.drawable.ictis),
                "content"
            )
        }


        Button(modifier = Modifier
            .padding(top = 250.dp)
            .width(270.dp)
            .height(70.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.salatGreen
            ),
            shape = RoundedCornerShape(10.dp),
            onClick = { navController.navigate("loginScreen")},
            content = {
                CommonText(text = "Войти", color = Color.White, fontSize = 18.sp)
            })

        Button(modifier = Modifier
            .padding(top = 32.dp)
            .width(270.dp)
            .height(70.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.blueButton
            ),
            shape = RoundedCornerShape(10.dp),
            onClick = {/*Начать тест у студентов группы*/ },
            content = {
                CommonText(text = "Зарегистрироваться", color = Color.White, fontSize = 18.sp)
            })

    }
}

val Colors.salatGreen : Color
    get() = Color(0xFFB6E739)

val Colors.darkGreen : Color
    get() = Color(0xFF167058)

val Colors.blue : Color
    get() = Color(0xFF0852E2)

val Colors.darkBlue : Color
    get() = Color(0xFF0500FF)

val Colors.blueButton : Color
    get() = Color(0xFF403EFD)
