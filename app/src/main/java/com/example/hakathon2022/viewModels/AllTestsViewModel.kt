package com.example.hakathon2022.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hakathon2022.TestsService
import com.example.hakathon2022.models.LoginData
import com.example.hakathon2022.models.Test
import com.example.hakathon2022.repository.Repositories
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class AllTestsViewModel: ViewModel() {

    private var repository = Repositories()

    val TestsService = TestsService()
    val listTests = TestsService.tests

    private val _tests: MutableLiveData<List<Test>> by lazy {
        MutableLiveData<List<Test>>(listTests)
    }

    val tests: LiveData<List<Test>> = _tests

    companion object{
        val shared = AllTestsViewModel()
    }


    fun getToken(){
        CoroutineScope(Dispatchers.IO).launch {

            val response = repository.getTokenJSON(LoginData("aw@aw","1234","student"))
            withContext(Dispatchers.Main) {

                if (response.isSuccessful) {
                    var token = response.body()!!
                    token.token
                    Log.d("----content", token.token)
                } else {
                    Log.e("----RORETROFIT_ERR", response.code().toString())
                }
            }
        }
    }
}