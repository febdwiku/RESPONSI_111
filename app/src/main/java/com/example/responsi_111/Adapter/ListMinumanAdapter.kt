package com.example.responsi_111.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.responsi_111.Model.Minuman
import com.example.responsi_111.Model.MinumanData.listMinuman
import com.example.responsi_111.R

class ListMinumanAdapter(private val listMinuman: ArrayList<Minuman>) : RecyclerView.Adapter<ListMinumanAdapter.MinumanViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MinumanViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_minuman, parent, false)
        return MinumanViewHolder(view)
}
    override fun getItemCount(): Int {
        return listMinuman.size
    }

    override fun onBindViewHolder(holder: MinumanViewHolder, position: Int) {
        val minuman = listMinuman[position]
        holder.tvName.text = minuman.name
        holder.tvDetail.text = minuman.detail
        Glide.with(holder.itemView.context)
            .load(minuman.poster)
            .into(holder.imgPoster)

        holder.itemView.setOnClickListener{
            Toast.makeText(
                holder.itemView.context, "Kamu memilih " + listMinuman[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }


    inner class MinumanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }
}