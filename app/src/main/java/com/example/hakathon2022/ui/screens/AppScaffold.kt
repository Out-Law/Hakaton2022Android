package com.example.hakathon2022.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.hakathon2022.navigation.NavigationHost
import com.example.hakathon2022.navigation.NavigationItem


@Composable
fun AppScaffold(navController: NavController) {
    val scaffoldState = rememberScaffoldState()

    Scaffold(

        bottomBar = {
            BottomBar(navController = navController)
        },
        scaffoldState = scaffoldState,

        ) {

        NavigationHost(navController = navController)

    }

}


@Composable
fun BottomBar(navController: NavController) {

    val items = listOf(
        NavigationItem.Offline,
        NavigationItem.Online
    )

    BottomNavigation(
        elevation = 5.dp,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.map {
            BottomNavigationItem(
                icon = {
                    Icon(it.icon, "")
                },
                label = {
                    Text(
                        text = it.title
                    )
                },
                selected = currentRoute == it.route,
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(alpha = 0.4f),
                onClick = {
                    navController.navigate(it.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
            )
        }

    }
}