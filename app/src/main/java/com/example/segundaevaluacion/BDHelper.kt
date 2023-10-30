package com.example.segundaevaluacion

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BDHelper(context: Context, factory:SQLiteDatabase.CursorFactory?): SQLiteOpenHelper (context, DATABASE_NAME, factory,DATABASE_VERSION ) {

    companion object{

        private val DATABASE_NAME ="BDCL2"
        private val DATABASE_VERSION = 1
        private val TABLA_AUTOR = "AUTORES"
        private val COLUM_ID = "IDUSER"
        private val COLUM_AUTOR = "AUTOR"
        private val COLUM_LIBRO = "LIBRO"



    }

    override fun onCreate(db: SQLiteDatabase) {
        var queryCreateTable =("CREATE TABLE " + TABLA_AUTOR + " ( " +
                COLUM_ID + " INT PRIMARY KEY,"+
                COLUM_AUTOR + " TEXT,"+
                COLUM_LIBRO + " TEXT" + " ) "
                )
        db.execSQL(queryCreateTable)
    }

    fun CrearRegistro (autor:String,libro:String){

        val values = ContentValues();
        values.put(COLUM_AUTOR, autor)
        values.put(COLUM_LIBRO, libro)
        val db = this.writableDatabase
        db.insert(TABLA_AUTOR, null,values)
        db.close()

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}