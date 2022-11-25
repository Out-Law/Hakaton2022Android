package com.example.hakathon2022

import com.example.hakathon2022.models.Question
import com.example.hakathon2022.models.Test
import com.github.javafaker.Faker

class TestsService {
    var tests = mutableListOf<Test>()

    init {
        val faker = Faker.instance()
        tests =(1..10).map { Test(
            title = faker.animal().name(),
            subject = faker.company().name(),
            questions = listOf(
                Question(
                    title = faker.rickAndMorty().character(),
                    answers = listOf("var 1", "var 2", "var 3"),
                    rightIndex = 1
                ),
                Question(
                    title = faker.rickAndMorty().character(),
                    answers = listOf("var 1", "var 2", "var 3"),
                    rightIndex = 2
                ),
                Question(
                    title = faker.rickAndMorty().character(),
                    answers = listOf("var 1", "var 2", "var 3"),
                    rightIndex = 2
                )
            ),
            timer = "4:20",
            priority = it
        ) }.toMutableList()
    }
}