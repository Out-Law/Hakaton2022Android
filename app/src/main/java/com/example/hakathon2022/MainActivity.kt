package com.example.hakathon2022

import android.location.LocationManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.hakathon2022.ui.screens.*
import android.Manifest
import com.example.hakathon2022.ui.screens.Gps.RequestPermission
import com.example.hakathon2022.ui.theme.Material3ComposeTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalPermissionsApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navBarNavController = rememberNavController()
            /*Hakathon2022Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   *//* AllTestsScreen(AllTestsViewModel.shared)*//*
                    //AppScaffold(navController = navBarNavController)
                    //lectionScreenProfessor(lection = Lection(Professor(),"COS","KTbo4-7","15:20","Online"))
                    //createLectionScreen()
                    loginScreen()
                }
            }*/
            /*Material3ComposeTheme {
                RequestPermission(permission = Manifest.permission.ACCESS_FINE_LOCATION)
            }*/
            startScreen()
        }
    }
}
