package com.example.hakathon2022.repository

import com.example.hakathon2022.models.LoginData
import com.example.hakathon2022.models.Token
import com.squareup.moshi.Json
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface APIService {

    //GET
    @POST("/api/user/login")
    suspend fun login( @Body requestBody: RequestBody): Response<Token>

   /* @GET("api/v1/news/find?page=1&perPage=7")
    suspend fun findNews(
        @Query("author") author: String,
        @Query("keywords") keywords: String,
        @Query("tags") tags: String
    ): Response<New.ContentArray>

    @GET("/api/v1/news/user/{id}?page=1&perPage=7")
    suspend fun getUserNews(
        @Path("id") id: String
    ): Response<New.Data>

    @GET("/api/v1/user/info")
    suspend fun getUserInfo(): Response<User.Auth>

    @GET("/api/v1/user/{id}")
    suspend fun getUserInfoById(
        @Path("id") id: String
    ): Response<User.Auth>


    //POST
    @POST("/api/v1/news")
    suspend fun createNews(
        @Body requestBody: RequestBody
    ): Response<New.AnswerCreateNew>

    @POST("/api/v1/auth/login")
    suspend fun loginUser(
        @Body requestBody: RequestBody
    ): Response<User.Auth>

    @POST("/api/v1/auth/register")
    suspend fun registrUser(
        @Body requestBody: RequestBody
    )

    @Multipart
    @POST("/api/v1/file/uploadFile")
    suspend fun uploadFile(
        @Part file: MultipartBody.Part,
    ): Response<User.File>



    //DELETE
    @DELETE("/api/v1/news/{id}")
    fun deleteNew(@Path("id") id: String): Call<New.Data>

    @DELETE("/api/v1/user")
    fun deleteUser(@Path("id") id: String): Call<New.Data>


    //PATCH*/
}