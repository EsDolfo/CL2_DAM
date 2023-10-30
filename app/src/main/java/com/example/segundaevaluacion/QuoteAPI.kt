package com.example.segundaevaluacion

import retrofit2.Response
import retrofit2.http.GET

interface QuoteAPI {


    @GET("/1.0/search/mongodb")
    suspend fun getQuotes(): Response<QuotesList>


}