package com.example.retrofit.data.network

import com.example.retrofit.data.model.Game
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("games")
    suspend fun getGames(): Response<List<Game>>


}

object RetrofitInstance {
    val retrofit = Retrofit.Builder()
        .baseUrl(" https://www.freetogame.com/api/ ")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiClient = retrofit.create(ApiService::class.java)

}

