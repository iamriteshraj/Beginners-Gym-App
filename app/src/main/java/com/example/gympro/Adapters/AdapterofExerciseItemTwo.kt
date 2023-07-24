package com.example.gympro.Adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gympro.ItemViewModel.DataModelOfExerciesTypeTwo
import com.example.gympro.R

class AdapterofExerciseItemTwo(
    private val WorkoutListB: ArrayList<DataModelOfExerciesTypeTwo>,
    val context: Context?,
    var onItemClickListener: OnItemClickListener

) :
    RecyclerView.Adapter<AdapterofExerciseItemTwo.MyViewHolder>() {


    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    class MyViewHolder(itemView: View, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(itemView) {


        val ExNameB: TextView = itemView.findViewById(R.id.workoutnames02)
        val EXSetB: TextView = itemView.findViewById(R.id.workoutset02)
        val EXImageB: ImageView = itemView.findViewById(R.id.imageOfExercise02)


        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item__two__exercise, parent, false)
        return MyViewHolder(view, onItemClickListener)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitemx = WorkoutListB[position]

        holder.ExNameB.text = currentitemx.ExerciseName
        holder.EXSetB.text = currentitemx.ExerciseSet

   //     holder.EXImageB.setImageResource(currentitemx.ExercisePic)

        Glide.with(context!!.applicationContext)
            .load(currentitemx.ExercisePic)
            .into(holder.EXImageB)


    }

    override fun getItemCount(): Int {

        return WorkoutListB.size
    }


}

