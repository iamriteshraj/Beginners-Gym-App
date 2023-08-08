package com.example.gympro.FragmentOfHomeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.gympro.Adapters.AdapterOfAllWorkouts
import com.example.gympro.ItemViewModel.DataModelOfAllWorkouts
import com.example.gympro.R
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.FirebaseDatabase


class TEST : Fragment() {


    var adapterOfAll: AdapterOfAllWorkouts? = null
    lateinit var RV99: RecyclerView


    var positionx: Int = 0
    override fun onCreateView(


//
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_t_e_s_t, container, false)

        RV99 = view.findViewById(R.id.rv999f)




        positionx = arguments?.getInt("dog")!!.toInt()


        if (positionx == 0) {


            val optionsB: FirebaseRecyclerOptions<DataModelOfAllWorkouts> =
                FirebaseRecyclerOptions.Builder<DataModelOfAllWorkouts>().setQuery(
                    FirebaseDatabase.getInstance().reference.child("45_Min_Full_Body"),
                    DataModelOfAllWorkouts::class.java
                ).build()


            adapterOfAll = AdapterOfAllWorkouts(context, optionsB)

            RV99.adapter = adapterOfAll

        }

        if (positionx == 1) {

            val optionsB: FirebaseRecyclerOptions<DataModelOfAllWorkouts> =
                FirebaseRecyclerOptions.Builder<DataModelOfAllWorkouts>().setQuery(
                    FirebaseDatabase.getInstance().reference.child("CAARDIO"),
                    DataModelOfAllWorkouts::class.java
                ).build()


            adapterOfAll = AdapterOfAllWorkouts(context, optionsB)

            RV99.adapter = adapterOfAll
        }
        if (positionx == 2) {

            val optionsB: FirebaseRecyclerOptions<DataModelOfAllWorkouts> =
                FirebaseRecyclerOptions.Builder<DataModelOfAllWorkouts>().setQuery(
                    FirebaseDatabase.getInstance().reference.child("GYM_AT_HOME"),
                    DataModelOfAllWorkouts::class.java
                ).build()


            adapterOfAll = AdapterOfAllWorkouts(context, optionsB)

            RV99.adapter = adapterOfAll

        }
        if (positionx == 3) {

            val optionsB: FirebaseRecyclerOptions<DataModelOfAllWorkouts> =
                FirebaseRecyclerOptions.Builder<DataModelOfAllWorkouts>().setQuery(
                    FirebaseDatabase.getInstance().reference.child(""),
                    DataModelOfAllWorkouts::class.java
                ).build()


            adapterOfAll = AdapterOfAllWorkouts(context, optionsB)

            RV99.adapter = adapterOfAll

        }
        if (positionx == 4) {

            val optionsB: FirebaseRecyclerOptions<DataModelOfAllWorkouts> =
                FirebaseRecyclerOptions.Builder<DataModelOfAllWorkouts>().setQuery(
                    FirebaseDatabase.getInstance().reference.child(""),
                    DataModelOfAllWorkouts::class.java
                ).build()


            adapterOfAll = AdapterOfAllWorkouts(context, optionsB)

            RV99.adapter = adapterOfAll

        }


        //


        return view

    }

    override fun onStart() {
        super.onStart()
        adapterOfAll!!.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapterOfAll!!.stopListening()

    }


}