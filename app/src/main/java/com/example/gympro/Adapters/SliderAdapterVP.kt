package com.example.gympro.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gympro.ItemViewModel.SliderModelVP
import com.example.gympro.R

class SliderAdapterVP(val List: ArrayList<SliderModelVP>, val context: Context) :
    RecyclerView.Adapter<SliderAdapterVP.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val IMAGESLIDER: ImageView = itemView.findViewById(R.id.IV1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val view = LayoutInflater.from(parent.context).inflate(R.layout.sliderlayout_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val current_item = List[position]

        Glide.with(context.applicationContext)
            .load(current_item.IMAGE)
            .into(holder.IMAGESLIDER)

        holder.itemView.setOnClickListener {

            Toast.makeText(context, current_item.ID.toString(), Toast.LENGTH_SHORT).show()
        }

    }


}