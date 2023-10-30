package com.example.segundaevaluacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RegLibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_libro)

        //boton registrar
        val btnGrabar = findViewById<Button>(R.id.btnCrear)

        btnGrabar.setOnClickListener(){
            val inputAutor : EditText = findViewById(R.id.txtAutor)
            val inputLibro : EditText = findViewById(R.id.txtLibro)

            val autor = inputAutor.text.toString()
            val libro = inputLibro.text.toString()


            val db = BDHelper(this, null)

            db.CrearRegistro(autor,libro)
            Toast.makeText(this, "Se registro ha sido exitoso", Toast.LENGTH_SHORT).show()

        }
        //boton limpiar
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        btnLimpiar.setOnClickListener(){
            val inputAutor : EditText = findViewById(R.id.txtAutor)
            val inputLibro : EditText = findViewById(R.id.txtLibro)

            inputLibro.text.clear()
            inputAutor.text.clear()
        }
        //ReclyclerView

        val autorRecycler = findViewById<RecyclerView>(R.id.rv_listAutores)
        autorRecycler.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<TablaViewModel>()
        for(i in 1 .. 20){
            data.add(TablaViewModel(R.drawable.ic_launcher_background,"Autor Nr"+i,"Libro Nr" + i))
        }

        val adapter = AutorAdapter(data)

        autorRecycler.adapter = adapter


































    }
}