package com.example.hakathon2022.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hakathon2022.ui.screens.*
import com.example.hakathon2022.ui.screens.QRcode.ScreenQR
import com.google.android.gms.location.FusedLocationProviderClient


@Composable
fun NavigationHost(navController:NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = "startScreen"
    ) {
        composable("startScreen") {
            startScreen(navController)
        }
        composable("registrationScreen") {
            registrationScreen(navController)
        }
        composable("loginScreen") {
            loginScreen(navController)
        }
        composable("sheduleScreen") {
            sheduleScreen(navController)
        }
        composable("lectionScreenStudent"){
            lectionScreenStudent(navController)
        }
        composable("QRStudentScreen"){
            QRStudentScreen(navController)
        }
        composable("ScreenQR"){
            ScreenQR(navController)
        }
    }
}
