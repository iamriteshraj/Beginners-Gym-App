package com.example.gympro.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gympro.ItemViewModel.DataModelOfExerciesType
import com.example.gympro.R

class WorkoutBbodyPartsViewModel : ViewModel() {
    val dataX = ArrayList<DataModelOfExerciesType>()

    fun tostoredata() {
        dataX.clear()
        dataX.add(DataModelOfExerciesType("12", "Full Body","https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Ffull%20body%20(1).jpg?alt=media&token=0e3e1346-95f1-4575-be6d-2a1e7b997bf7"))
        dataX.add(DataModelOfExerciesType("12", "Chest", "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Fc5%20(1).jpg?alt=media&token=b51d12d6-0974-46aa-920d-47c141db02f4"))
        dataX.add(DataModelOfExerciesType("12", "Triceps", "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Ftriceps%20(1).jpg?alt=media&token=451b1fd5-9453-4a49-88ec-081fc640faf1"))
        dataX.add(DataModelOfExerciesType("12", "Back", "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Fbackk%20(1).jpg?alt=media&token=ce0b5491-3b4c-4779-8f56-843b5d9cb449"))
        dataX.add(DataModelOfExerciesType("12", "Biceps","https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Fbicepsa%20(1).jpg?alt=media&token=52e4e5f3-722a-4289-9c09-d721196160ed"))
        dataX.add(DataModelOfExerciesType("12", "Shoulder", "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Fshoulder%20(1).jpg?alt=media&token=47e4f734-37a7-47bf-823d-c4c263cd09f9"))
        dataX.add(DataModelOfExerciesType("12",  "Leg" ,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Ffull%20body%20(1).jpg?alt=media&token=0e3e1346-95f1-4575-be6d-2a1e7b997bf7"))
        dataX.add(DataModelOfExerciesType("12", "Abs", "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Fabss%20(1).jpg?alt=media&token=8bcf22af-0406-497a-96eb-95675d91b0c7"))
        dataX.add(DataModelOfExerciesType("12", "AdOn", "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/Workout%20Section%2Fadon%20(1).jpg?alt=media&token=9fdefba8-3377-46ed-8fab-248176d7864d"))


    }


}

