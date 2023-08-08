package com.example.gympro.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gympro.ItemViewModel.DataModelOfAllWorkouts
import com.example.gympro.R
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions


class AdapterOfAllWorkouts( val context: Context?, optionsB: FirebaseRecyclerOptions<DataModelOfAllWorkouts>)

    : FirebaseRecyclerAdapter<DataModelOfAllWorkouts, AdapterOfAllWorkouts.Myviewholder>(optionsB) {


    class Myviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val workoutName: TextView = itemView.findViewById(R.id.workout_Name_b)
        val workoutSection: TextView = itemView.findViewById(R.id.workout_Section_b)
        val workoutImage: ImageView = itemView.findViewById(R.id.workout_Image_b)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_of_all_workouts, parent, false)
        return Myviewholder(view)
    }

    override fun onBindViewHolder(
        holder: Myviewholder,
        position: Int,
        model: DataModelOfAllWorkouts
    ) {

        println("SONU"+model.name)
        holder.workoutName.text = model.name
        holder.workoutSection.text = model.section
      // holder.workoutImage.setImageResource(model.url.hashCode())
        Glide.with(context!!.applicationContext)
            .load(model.url)
            .into(holder.workoutImage)
    }


}