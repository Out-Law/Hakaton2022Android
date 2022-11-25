package com.example.hakathon2022.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.hakathon2022.models.Test
import com.example.hakathon2022.ui.common.MessageCard
import com.example.hakathon2022.viewModels.AllTestsViewModel

@Composable
fun AllTestsScreen(allTestsViewModel: AllTestsViewModel) {
    val tests = allTestsViewModel.listTests

    Scaffold(
        content = {
        ListTests(listTests = tests)
    })
}

@Composable
fun ListTests(listTests: List<Test>){
    LazyColumn {
        items(1) {
            listTests.forEach { content ->
                MessageCard(
                    content
                ){
                    //TODO
                }
            }
        }
    }
}