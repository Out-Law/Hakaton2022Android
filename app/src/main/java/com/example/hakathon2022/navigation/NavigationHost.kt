package com.example.hakathon2022.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hakathon2022.ui.screens.Start
import com.google.android.gms.location.FusedLocationProviderClient


@Composable
fun NavigationHost(navController: NavController, fusedLocationProviderClient: FusedLocationProviderClient) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = NavigationItem.Offline.route
    ) {
        composable(NavigationItem.Offline.route) {
            /*HomeScreen(NewsModel.shared, navController)*/
            Start()
        }
        composable(NavigationItem.Online.route) {
           /* UserModel.shared.getUserInfo()
            ProfileScreen(NewsModel.shared, UserModel.shared)*/
            Start()
        }
    }
}
