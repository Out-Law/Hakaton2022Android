package com.example.hakathon2022.models

open class User {
    lateinit var name: String
    lateinit var surname: String
}

class Student:User() {
    lateinit var group: String
}

class Professor:User(){
    lateinit var tests: List<Test>
    lateinit var groups: List<String>
}