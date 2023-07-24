package com.example.gympro.Adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.example.gympro.ItemViewModel.DataModelOfExerciesType
import com.example.gympro.R



class AdapterOfWorkoutByBodyPart(private val WorkoutList: ArrayList<DataModelOfExerciesType>, private val context: Context?) :
    RecyclerView.Adapter<AdapterOfWorkoutByBodyPart.ViewHolder>() {

    //////
    private lateinit var mListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {

        mListener = listener
    }
    //////////////

    class ViewHolder(itemView: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(itemView) {


        val ExName: TextView = itemView.findViewById(R.id.workoutnames01)
        val EXCount: TextView = itemView.findViewById(R.id.exercisecount01)
        val EXImage: ImageView = itemView.findViewById(R.id.imageOfExercise)


        init {


            itemView.setOnClickListener {

                listener.onItemClick(adapterPosition)
            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item__one__exercise, parent, false)
        return ViewHolder(view, mListener)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val currentItem = WorkoutList[position]

        holder.EXCount.text = currentItem.NoOfExercise
        holder.ExName.text = currentItem.ExerciseName
        //     holder.EXImage.setImageResource(currentItem.ExercisePic)


        Glide.with(context!!.applicationContext)
            .load(currentItem.ExercisePic)
            .into(holder.EXImage)


    }

    override fun getItemCount(): Int {
        return WorkoutList.size

    }


}

