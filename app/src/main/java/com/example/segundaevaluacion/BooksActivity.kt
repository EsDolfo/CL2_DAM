package com.example.segundaevaluacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.create

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)


        val quotesApi = RetrofitHelper.getRetrofitInstance().create(QuoteAPI::class.java)

        GlobalScope.launch {
            val result = quotesApi.getQuotes()
            if(result != null)
                Log.d("REST RESPONSE: ",result.body().toString())

            //Recycler

            val libroRecyclerView = findViewById<RecyclerView>(R.id.rv_listLibros)
            libroRecyclerView.layoutManager = LinearLayoutManager(this@BooksActivity)

            val data = ArrayList<LibroPViewModel>()

            for(i in 1 .. 20){
                data.add(LibroPViewModel(R.drawable.ic_launcher_background,"Libro Nr"+i,"Precio Nr" + i))
            }
            val adapter = LibroPAdapter(data)
            libroRecyclerView.adapter = adapter


        }


    }
}