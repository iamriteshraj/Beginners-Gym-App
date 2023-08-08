package com.example.gympro.FragmentOfHomeScreen

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.gympro.Adapters.AdapterOfWorkoutByBodyPart
import com.example.gympro.Adapters.SliderAdapterVP
import com.example.gympro.ItemViewModel.SliderModelVP
import com.example.gympro.R
import com.example.gympro.util.OnItemClickListner
import com.example.gympro.viewmodel.WorkoutBbodyPartsViewModel
import kotlin.math.abs


class HomePage : Fragment() {


    lateinit var VP_TopWorkout: ViewPager2
    lateinit var RV_Category: RecyclerView
    lateinit var adapterA: SliderAdapterVP    // adapter of view pager

    // lateinit var adapterB: AdapterOfWorkoutByBodyPart
    lateinit var sliderListA: ArrayList<SliderModelVP>
    lateinit var sliderListB: ArrayList<SliderModelVP>
    val sliderhandler = Handler()

    lateinit var workoutBodyPartsViewmodel: WorkoutBbodyPartsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.home_page, container, false)




        VP_TopWorkout = view.findViewById(R.id.viewPager11)
        RV_Category = view.findViewById(R.id.RV_Of_Category)
        RV_Category.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        sliderListA = ArrayList()
        sliderListB = ArrayList()


        /// recycler view work ///

        workoutBodyPartsViewmodel = ViewModelProvider(this)[WorkoutBbodyPartsViewModel::class.java]
        workoutBodyPartsViewmodel.tostoredata()
        val WBPV = workoutBodyPartsViewmodel.dataX
        val adapterOfHome = AdapterOfWorkoutByBodyPart(WBPV, context)
        RV_Category.adapter = adapterOfHome

        adapterOfHome.setOnItemClickListener(object :
            AdapterOfWorkoutByBodyPart.onItemClickListener {
            override fun onItemClick(position: Int) {
                val b = Bundle()
                b.putString("rowtitle", WBPV[position].ExerciseName)
                b.putInt("RRR", position)
                val fragmentHero: Fragment = Hero()
                val fm = activity!!.supportFragmentManager.beginTransaction()
                fm.replace(R.id.framelayout, fragmentHero).addToBackStack(null).commit()
                fragmentHero.arguments = b;

            }

        })


        // work of view pager///////////////////////////

        // adding element in arraylist of viewpager

        sliderListA.add(
            SliderModelVP(
                0,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/workout%20type%201%2F45%20min%20full%20body.png?alt=media&token=0de01e89-e364-4f8c-85cf-e564827970c3"
            )
        )
        sliderListA.add(
            SliderModelVP(
                1,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/workout%20type%201%2Fcardio%201.png?alt=media&token=9b8547fe-32af-4167-ac43-1eb646a93e6d"
            )
        )
        sliderListA.add(
            SliderModelVP(
                2,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/workout%20type%201%2Fgym%20at%20home%201.png?alt=media&token=b2a70399-ac3f-4366-864b-9b0f52833ae9"
            )
        )
        sliderListA.add(
            SliderModelVP(
                3,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/workout%20type%201%2Fstretchng%2001.png?alt=media&token=970d6a36-6442-41c1-97f0-452d39e8cda2"
            )
        )
        sliderListA.add(
            SliderModelVP(
                4,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/workout%20type%201%2Fyoga%201.png?alt=media&token=6b147848-91e6-41b9-aabb-39fe798064f2"
            )
        )





        adapterA = SliderAdapterVP(sliderListA, requireContext(), object : OnItemClickListner {
            override fun onclick(position: Int) {

                val bundeld = Bundle()
                bundeld.putInt("dog", position)

                val fragmentHero: Fragment = TEST()
                val fm = activity!!.supportFragmentManager.beginTransaction()
                fm.replace(R.id.framelayout, fragmentHero).addToBackStack(null).commit()
                fragmentHero.arguments = bundeld


                //    Toast.makeText(context, "1", Toast.LENGTH_LONG).show()


//                val b = Bundle()
//                b.putString("rowtitle", WBPV[position].ExerciseName)
//                b.putInt("RRR", position)
//                val fragmentHero: Fragment = Hero()
//                val fm = activity!!.supportFragmentManager.beginTransaction()
//                fm.replace(R.id.framelayout, fragmentHero).addToBackStack(null).commit()
//                fragmentHero.arguments = b;

//////////


            }
        })

        adapterA.notifyDataSetChanged()
        VP_TopWorkout.adapter = adapterA


        //////////////(View Pager Slider time)/////////////////

        VP_TopWorkout.clipToPadding = false
        VP_TopWorkout.clipChildren = false
        VP_TopWorkout.offscreenPageLimit = 3
        VP_TopWorkout.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        val compositePageTransformer = CompositePageTransformer()
        compositePageTransformer.addTransformer(MarginPageTransformer(40))
        compositePageTransformer.addTransformer(object : ViewPager2.PageTransformer {
            override fun transformPage(page: View, position: Float) {

                val r = 1 - abs(position)
                page.scaleY = 0.85f + r * 0.15f

            }


        })

        VP_TopWorkout.setPageTransformer(compositePageTransformer)
        VP_TopWorkout.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                sliderhandler.removeCallbacks(sliderRunable)


                sliderhandler.postDelayed(
                    sliderRunable, 7000
                )

                if (position == sliderListA.size - 2) {
                    VP_TopWorkout.post(runnable)
                }
            }
        })

        return view

    }


    val sliderRunable = Runnable { VP_TopWorkout.currentItem = VP_TopWorkout.currentItem + 1 }

    val runnable = Runnable {
        sliderListA.addAll(sliderListA)
        adapterA.notifyDataSetChanged()

    }


    override fun onPause() {
        super.onPause()
        sliderhandler.removeCallbacks(sliderRunable)

    }

    override fun onResume() {
        super.onResume()
        sliderhandler.postDelayed(
            sliderRunable, 7000
        )
    }


}









