package com.example.hakathon2022.repository

import com.example.hakathon2022.models.LoginData
import com.example.hakathon2022.models.Token
import com.squareup.moshi.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repositories {

    private fun createRetrofit(): Retrofit {
        val logging = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(logging).build()

        return Retrofit.Builder()
            .client(client)
            .baseUrl("http://95.163.243.252:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }




    suspend fun getTokenJSON(data: LoginData): Response<Token> {

        val client: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(Interceptor { chain ->
                val newRequest: Request = chain.request().newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .build()
                chain.proceed(newRequest)
            })
            .build()

        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl("http://95.163.243.252:5000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(APIService::class.java)

        val jsonObject = JSONObject()
        jsonObject.put("email", data.email)
        jsonObject.put("role", data.role)
        jsonObject.put("password", data.password)

        val jsonObjectString = jsonObject.toString()

        val requestBody = jsonObjectString.toRequestBody("application/json".toMediaTypeOrNull())

        return service.login(requestBody)
    }


}