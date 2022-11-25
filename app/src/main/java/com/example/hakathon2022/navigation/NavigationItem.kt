package com.example.hakathon2022.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object Offline : NavigationItem("Offline", Icons.Filled.Phone, "Offline")
    object Online : NavigationItem("Online", Icons.Filled.LocationOn, "Online")
}