package com.example.segundaevaluacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        //btnPregunta1

        val btnPreg1 = findViewById<Button>(R.id.btnP1)

        btnPreg1.setOnClickListener{
            val pantallaPregunta1 = Intent(this,RegLibroActivity::class.java)
            startActivity(pantallaPregunta1)
        }


        //btnPregunta2

        val btnPreg2 =findViewById<Button>(R.id.btnP2)

        btnPreg2.setOnClickListener{
            val pantallaPreguntaDos = Intent(this,BooksActivity::class.java)
            startActivity(pantallaPreguntaDos)
        }































    }
}