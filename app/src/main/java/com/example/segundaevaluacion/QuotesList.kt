package com.example.segundaevaluacion

data class QuotesList(
    val error: String,
    val total : String,
    val page : String,
    val result: List<Books>
)