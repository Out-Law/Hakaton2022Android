package com.example.hakathon2022

import com.example.hakathon2022.models.Student
import com.github.javafaker.Faker

class UsersService {
    var student = Student()

    init {
        val faker = Faker.instance()
        student.group = faker.company().name()
        student.surname = faker.name().lastName()
        student.name = faker.name().name()
    }
}