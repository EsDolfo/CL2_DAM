package com.example.segundaevaluacion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AutorAdapter(private val mList: List<TablaViewModel>): RecyclerView.Adapter<AutorAdapter.ViewHolder>() {

    class ViewHolder (ItemView: View): RecyclerView.ViewHolder(ItemView) {

        val imageView: ImageView = ItemView.findViewById(R.id.img_autor)
        val autorView: TextView = ItemView.findViewById(R.id.lbl_autor)
        val libroView: TextView = ItemView.findViewById(R.id.lbl_libro)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.autor_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewModel = mList[position]
        holder.imageView.setImageResource(itemViewModel.image)
        holder.autorView.text = itemViewModel.autor
        holder.libroView.text = itemViewModel.libro
    }

























}