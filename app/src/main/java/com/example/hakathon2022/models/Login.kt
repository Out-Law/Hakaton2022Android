package com.example.hakathon2022.models

data class LoginData (
    val email: String,
    val password: String,
    val role: String
)

data class Token (
    val token: String,
)