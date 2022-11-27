package com.example.hakathon2022.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hakathon2022.R
import com.example.hakathon2022.ui.common.CommonText
import com.example.hakathon2022.ui.common.SegmentedControl
import com.example.hakathon2022.viewModels.AllTestsViewModel

@Composable
fun loginScreen(navController: NavHostController) {
    var login = remember { mutableStateOf("")}
    var password = remember { mutableStateOf("")}
    val checkedState = remember { mutableStateOf(false)}
    var role: String
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
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.padding(top = 200.dp)
    ) {
        Image(
            painterResource(id = R.drawable.back),
            contentDescription = "fuck",
            modifier = Modifier.fillMaxSize()
        )
    }
    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()){
        Row (modifier = Modifier.padding(top = 64.dp)){
            Image(
                painterResource(id = R.drawable.sfedu),
                "content"
            )

            Image(
                painterResource(id = R.drawable.ictis),
                "content"
            )
        }

        val roles = listOf("Студент","Преподаватель")
        Row (modifier = Modifier.padding(top = 150.dp)){
            SegmentedControl(items = roles, defaultSelectedItemIndex = 0) {
                //Log.e("CustomToggle", "Selected item : ${roles[it]}")
                if (it == 0) role = "Student"
                else role = "Professor"
                Log.e("CustomToggle", "Selected item : ${role}")
            }
        }

        OutlinedTextField(modifier = Modifier.padding(top = 32.dp), value = login.value , placeholder = { CommonText(text = "Login", color = Color.Gray) }, shape = RoundedCornerShape(15.dp),
            onValueChange = { newText->
            login.value = newText
        })
        OutlinedTextField(modifier = Modifier.padding(top = 32.dp), value = password.value, placeholder = { CommonText(text = "Password", color = Color.Gray) }, shape = RoundedCornerShape(15.dp),
            onValueChange = { newText ->
            password.value = newText
        })

        Button(modifier = Modifier
            .padding(top = 32.dp)
            .width(270.dp)
            .height(70.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colors.blueButton
            ),
            shape = RoundedCornerShape(10.dp),

            onClick = {
                //AllTestsViewModel.shared.getToken()
                navController.navigate("sheduleScreen")
            },
            content = {
                CommonText(text = "Войти", color = Color.White, fontSize = 18.sp)
            })
        
        
    }
}