package com.example.gympro.FragmentOfHomeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.gympro.Adapters.AdapterOfAllWorkouts
import com.example.gympro.Adapters.Videoadapter
import com.example.gympro.ItemViewModel.DataModelOfAllWorkouts
import com.example.gympro.R
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.FirebaseDatabase


class AllWorkouts : Fragment() {


    lateinit var RV_all_Workouts: RecyclerView
    var adapterOfAll: AdapterOfAllWorkouts? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.allworkouts, container, false)


        RV_all_Workouts = view.findViewById(R.id.RV_All_Workouts)


        val optionsB: FirebaseRecyclerOptions<DataModelOfAllWorkouts> =
            FirebaseRecyclerOptions.Builder<DataModelOfAllWorkouts>()
                .setQuery(
                    FirebaseDatabase.getInstance().reference.child("WORKOUTALL_1"),
                    DataModelOfAllWorkouts::class.java
                )
                .build()

        ///

        println("Applec"+optionsB)
        adapterOfAll = AdapterOfAllWorkouts(context, optionsB)
        RV_all_Workouts.adapter = adapterOfAll



        return view
    }

    override
    fun onStart() {
        super.onStart()
        adapterOfAll!!.startListening()
    }

    override
    fun onStop() {
        super.onStop()
        adapterOfAll!!.stopListening()

    }
}
