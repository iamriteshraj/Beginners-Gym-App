package com.example.gympro.FragmentOfHomeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.gympro.R
import com.example.gympro.databinding.FragmentSettingEditProfileBinding


class SettingOfEditProfile : Fragment() {


    lateinit var binding: FragmentSettingEditProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingEditProfileBinding.inflate(inflater, container, false)


        binding.BTNsave98.setOnClickListener {

            val NAME: String = binding.ETname.text.toString()
            val AGE: String = binding.ETage.text.toString()
            val WEIGHT: String = binding.ETweight.text.toString()
            val HEIGHT_IN_FEET: String = binding.ETheightinfeet.text.toString()
            val HEIGHT_IN_INCH: String = binding.ETheightinfeet.text.toString()


            val bundle = Bundle()
            bundle.putString("DataName", NAME)
            bundle.putString("DatAge", AGE)
            bundle.putString("DataWeight", WEIGHT)
            bundle.putString("DataHeightInFeet", HEIGHT_IN_FEET)
            bundle.putString("DataHeightInInch", HEIGHT_IN_INCH)

            val fragment = Profile()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.nnn, fragment)?.commit()
            Toast.makeText(context, "SEND", Toast.LENGTH_LONG).show()


        }

        return binding.root


    }


}