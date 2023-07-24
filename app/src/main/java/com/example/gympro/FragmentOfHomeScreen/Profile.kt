package com.example.gympro.FragmentOfHomeScreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.gympro.FragmentOfHomeScreen.FragmentOfProfiles.BMI_Result
import com.example.gympro.FragmentOfHomeScreen.FragmentOfProfiles.FCaloriesCounter
import com.example.gympro.R


class Profile : Fragment() {


    lateinit var BTNPROFILE: ImageView
    lateinit var profilenamee: TextView
    lateinit var cv1_BMI: CardView
    lateinit var cv2_CALORIESCOUNTER: CardView




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)


        cv1_BMI = view.findViewById(R.id.CV1)
        cv2_CALORIESCOUNTER=view.findViewById(R.id.CVcaloriescounter)
        BTNPROFILE = view.findViewById(R.id.setting99)
        BTNPROFILE.setOnClickListener {

            val secondFragment = SettingOfEditProfile()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nnn, secondFragment)
            transaction.commit()

        }

        profilenamee = view.findViewById(R.id.profilename)

        val args = this.arguments
        val inputdata = args?.get("DataName")

        //profilenamee.text = inputdata.toString()

        val value: String = inputdata.toString()


//
        var preferences = this.requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE)
        var editor = preferences.edit()


        editor.apply {

            putString("username", value)

        }
            .apply()
        editor.putString("username", value)
        // editor.putLong("l",100L)
        editor.commit()
//
//
//
//
        var preferencesz = this.requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE)
        val fff: String = preferencesz.getString("username", "hero").toString()
        profilenamee.text = fff

                       //////////////////// card view click listener//////////////////////////////////////////
        cv1_BMI.setOnClickListener {

            val bmiResult = BMI_Result()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nnn, bmiResult)
            transaction.commit()


        }

        cv2_CALORIESCOUNTER.setOnClickListener{

            val caloritscounter =FCaloriesCounter()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.nnn, caloritscounter)
            transaction.commit()


        }









        return view
    }


}