package com.example.gympro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gympro.FragmentOfHomeScreen.Fit_Tv
import com.example.gympro.FragmentOfHomeScreen.Profile
import com.example.gympro.FragmentOfHomeScreen.AllWorkouts
import com.example.gympro.FragmentOfHomeScreen.HomePage
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        loadFragment(HomePage())

        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {


            when (it.itemId) {


                R.id.Workout -> loadFragment(HomePage())


                R.id.Record -> loadFragment(AllWorkouts())


                R.id.BMI -> loadFragment(Fit_Tv())


                R.id.Profile -> loadFragment(Profile())
                else -> {

                }

            }
            true


        }
    }


    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
        transaction.commit()
    }

}
