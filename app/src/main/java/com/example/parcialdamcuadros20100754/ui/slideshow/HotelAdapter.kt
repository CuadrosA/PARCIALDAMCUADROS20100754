package com.example.parcialdamcuadros20100754.ui.slideshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialdamcuadros20100754.R

class HotelAdapter (private  var list_hoteles: List<HotelModel>): RecyclerView.Adapter<HotelAdapter.ViewHolder>(){
    // Declaración de items del layout
    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val hotel_image: ImageView = itemView.findViewById(R.id.hotel_image)
        val hotel_name: TextView =  itemView.findViewById(R.id.tv_hotel_nombre)
        val hotel_review: TextView = itemView.findViewById(R.id.tv_hotel_review)
        val hotel_ubicacion: TextView = itemView.findViewById(R.id.tv_hotel_ubicacion)
        val hotel_precio: TextView = itemView.findViewById(R.id.tv_hotel_precio)
    }

    // Asignación del layout modelo a crearse
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_hotel, parent, false))
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val player_item = list_hoteles[position]
        holder.hotel_image.setImageResource(player_item.hotel_image)
        holder.hotel_name.text = player_item.hotel_name.toString()
        holder.hotel_review.text = player_item.hotel_review.toString()
        holder.hotel_ubicacion.text = player_item.hotel_ubicacion
        holder.hotel_precio.text = player_item.hotel_precio
    }

    // retorno de los elementos en la lista
    override fun getItemCount(): Int {
        return list_hoteles.size
    }
}