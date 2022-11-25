package com.example.hakathon2022.models

import java.util.Timer

data class Test (
    val title: String,
    val subject: String,
    val questions: List<Question>,
    val timer: Timer,

)

data class Question (
    val title: String,
    val answers: List<String>,
    val rightIndex: Int
)