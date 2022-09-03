package com.sco.pemula.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sco.pemula.DetailActivity
import com.sco.pemula.R
import com.sco.pemula.source.Item

class ListItemAdapter(private val listItem: ArrayList<Item>) : RecyclerView.Adapter<ListItemAdapter.ListViewHolder>() {

    inner class ListViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = itemView.findViewById(R.id.itemCardName)
        var tvDetail: TextView = itemView.findViewById(R.id.itemCardText)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = listItem[position]
        holder.imgPhoto.setImageResource(item.photo);
        holder.tvName.text = item.name
        holder.tvDetail.text = item.text

        holder.itemView.setOnClickListener {
            val moveWithDataIntent = Intent(holder.itemView.context, DetailActivity::class.java)
            moveWithDataIntent.putExtra("EXTRA_ID", position)
            holder.itemView.context.startActivity(moveWithDataIntent)
        }
    }

    override fun getItemCount(): Int {
        return listItem.size
    }
}



