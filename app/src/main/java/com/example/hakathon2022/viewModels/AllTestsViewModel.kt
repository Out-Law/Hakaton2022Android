package com.example.hakathon2022.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hakathon2022.TestsService
import com.example.hakathon2022.models.Test


class AllTestsViewModel: ViewModel() {

    val TestsService = TestsService()
    val listTests = TestsService.tests

    private val _tests: MutableLiveData<List<Test>> by lazy {
        MutableLiveData<List<Test>>(listTests)
    }

    val tests: LiveData<List<Test>> = _tests

    companion object{
        val shared = AllTestsViewModel()
    }
}