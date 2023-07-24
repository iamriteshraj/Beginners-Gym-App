package com.example.gympro.FragmentOfHomeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.gympro.Adapters.Videoadapter
import com.example.gympro.ItemViewModel.Videomodel
import com.example.gympro.R
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.FirebaseDatabase


class Fit_Tv : Fragment() {

    var viewPager2: ViewPager2? = null
    var adapter: Videoadapter? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fit_tv, container, false)


        viewPager2 = view.findViewById<ViewPager2>(R.id.vpager)

        val options: FirebaseRecyclerOptions<Videomodel> =
            FirebaseRecyclerOptions.Builder<Videomodel>()
                .setQuery(
                    FirebaseDatabase.getInstance().reference.child("VIDEO_1"),
                    Videomodel::class.java
                )
                .build()

        adapter = Videoadapter(options)
        viewPager2!!.adapter = adapter

        return view
    }


    override fun onStart() {
        super.onStart()
        adapter!!.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapter!!.stopListening()


    }


}



