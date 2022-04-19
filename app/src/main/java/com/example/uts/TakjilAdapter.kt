package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts.R
import com.example.uts.Takjil

class TakjilAdapter (private val context: Context, private val takjil: List<Takjil>, val listener: (Takjil) ->Unit)
    : RecyclerView.Adapter<TakjilAdapter.TakjilViewHolder>(){

    class TakjilViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgTakjil: ImageView = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameTakjil = view.findViewById<TextView>(R.id.tv_item_name)
        val descTakjil = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(takjil: Takjil, listener: (Takjil) -> Unit) {
            imgTakjil.setImageResource(takjil.imgTakjil)
            nameTakjil.text = takjil.nameTakjil
            descTakjil.text = takjil.descriptionTakjil
            itemView.setOnClickListener{listener(takjil)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TakjilViewHolder {
        return TakjilViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_takjil,parent, false)
        )
    }

    override fun onBindViewHolder(holder: TakjilViewHolder, position: Int) {
        holder.bindView(takjil[position], listener)
    }

    override fun getItemCount(): Int = takjil.size
}