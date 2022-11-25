package com.example.hakathon2022

import android.location.LocationManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.tooling.preview.Preview
import com.example.hakathon2022.ui.screens.AllTestsScreen
import com.example.hakathon2022.ui.screens.AppScaffold
import com.example.hakathon2022.ui.theme.Hakathon2022Theme
import com.example.hakathon2022.viewModels.AllTestsViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class MainActivity : ComponentActivity() {

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        setContent {
            val navBarNavController = rememberNavController()
            Hakathon2022Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   /* AllTestsScreen(AllTestsViewModel.shared)*/
                    AppScaffold(navController = navBarNavController)
                }
            }
        }
    }
}
