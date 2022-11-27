package com.example.hakathon2022.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.hakathon2022.navigation.NavigationHost


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AppScaffold(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    var navController = rememberNavController()
    Scaffold(
        scaffoldState = scaffoldState,

        ) {

        NavigationHost(navController = navController)

    }
}