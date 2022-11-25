package com.example.hakathon2022.models

abstract class User {
    abstract val name: String
    abstract val surname: String
}

data class Student(
    override val name: String,
    override val surname: String,
    val group: String
):User()

data class Professor(
    override val name: String,
    override val surname: String,
    val tests: List<Test>,
    val groups: List<String>
):User()