package com.example.gympro.FragmentOfHomeScreen.FragmentOfProfiles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.gympro.R


class BMI_Result : Fragment() {


    lateinit var etweight: EditText
    lateinit var etheight: EditText
    lateinit var etheight2: EditText
    lateinit var tvresult: TextView
    lateinit var tvBMI: TextView
    lateinit var btncalculate: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_b_m_i__result, container, false)


        etweight = view.findViewById(R.id.et1)
        etheight2 = view.findViewById(R.id.et2)
        etheight = view.findViewById(R.id.et3)
        tvresult = view.findViewById(R.id.tv1)
        tvBMI = view.findViewById(R.id.tv2)
        btncalculate = view.findViewById(R.id.btn1)



        btncalculate.setOnClickListener(View.OnClickListener {
            val wt = etweight.getText().toString().toInt()
            val ft = etheight.getText().toString().toInt()
            val `in` = etheight2.getText().toString().toInt()
            val totalIN = ft * 12 + `in`
            val totalCm = totalIN * 2.53
            val totalM = totalCm / 100
            val bmi = wt / (totalM * totalM)


            tvBMI.text = ("Your BMI Score is: " + bmi.toFloat())

            if (bmi > 25) {
                tvresult.setText("You Are Over Weight")

            } else if (bmi < 18) {

                tvresult.setText(" You Are Under Weight ")
                // llmain.setBackgroundColor(getResources().getColor(R.color.xyellow));
            } else {
                tvresult.setText(" You Are Healthy")
                //  llmain.setBackgroundColor(getResources().getColor(R.color.xgreen));
            }
        })

        return view
    }
}