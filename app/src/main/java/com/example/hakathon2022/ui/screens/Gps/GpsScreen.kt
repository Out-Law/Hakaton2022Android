package com.example.hakathon2022.ui.screens.Gps

import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import android.Manifest
import com.example.hakathon2022.ui.theme.Material3ComposeTheme

@Composable
fun GpsScreen() {
    Material3ComposeTheme {
        ActivityResultContracts.RequestPermission(permission = Manifest.permission.ACCESS_FINE_LOCATION)
    }
}