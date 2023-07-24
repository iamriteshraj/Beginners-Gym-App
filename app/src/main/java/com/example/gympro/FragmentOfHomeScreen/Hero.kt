package com.example.gympro.FragmentOfHomeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gympro.Adapters.AdapterofExerciseItemTwo
import com.example.gympro.ItemViewModel.DataModelOfExerciesTypeTwo
import com.example.gympro.R
import com.example.gympro.viewmodel.HeroViewModel


class Hero : Fragment() {



    var position: Int = 0
    var path: String = ""
    lateinit var recyclerView: RecyclerView
    lateinit var heroViewModel: HeroViewModel


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_hero, container, false)




        heroViewModel = ViewModelProvider(this)[HeroViewModel::class.java]
        heroViewModel.setDataB()



        recyclerView = view.findViewById(R.id.recyclerViewOfWorkouts2)
        recyclerView.layoutManager = LinearLayoutManager(context)



        position = arguments?.getInt("RRR")!!.toInt()
        path = arguments?.getString("rowtitle")!!.toString()




        when (position) {
            0 -> {
                loadFragment(heroViewModel.fullBody, path)
            }

            1 -> {
                loadFragment(heroViewModel.arrayListOfChest, path)
            }

            2 -> {
                loadFragment(heroViewModel.arrayListOfTriceps, path)
            }


            3 -> {
                loadFragment(heroViewModel.arrayListOfBack, path)
            }

            4 -> {
                loadFragment(heroViewModel.arrayListOfBiceps, path)
            }

        }

        return view
    }


    private fun loadFragment(Ayyaylistz: ArrayList<DataModelOfExerciesTypeTwo>, pAth: String) {
        val adapterofExerciseItemTwo = AdapterofExerciseItemTwo(Ayyaylistz, context,

            object : AdapterofExerciseItemTwo.OnItemClickListener {
                override fun onItemClick(position: Int) {

                    val b = Bundle()
                    b.putInt("RRRB", position)
                    b.putString("Apple", pAth)
                    val fragmentLast: Fragment = Last()
                    val fm = activity!!.supportFragmentManager.beginTransaction()
                    fm.replace(R.id.herof, fragmentLast).addToBackStack(null).commit()
                    fragmentLast.arguments = b


                }

            })
        recyclerView.adapter = adapterofExerciseItemTwo
    }

}

