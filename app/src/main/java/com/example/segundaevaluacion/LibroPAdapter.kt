package com.example.segundaevaluacion

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class LibroPAdapter(private val mList:List<LibroPViewModel>) : RecyclerView.Adapter<LibroPAdapter.ViewHolder>() {

    class ViewHolder(ItemView:View): RecyclerView.ViewHolder(ItemView){
        val imageView: ImageView = ItemView.findViewById(R.id.imgAndroid)
        val libroView: TextView = ItemView.findViewById(R.id.lbl_libroP)
        val precioView: TextView = ItemView.findViewById(R.id.lbl_precioP)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.libro_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewModel = mList[position]

        holder.imageView.setImageResource(itemViewModel.image)
        holder.libroView.text = itemViewModel.libro
        holder.precioView.text = itemViewModel.precio
    }


}