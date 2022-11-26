package com.example.hakathon2022.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.hakathon2022.ui.screens.QRcode.ScreenQR

@Composable
fun Start(){

    Scaffold(
        content = {
            ScreenQR()
        }
    )
}