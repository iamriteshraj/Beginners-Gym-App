package com.example.gympro.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gympro.ItemViewModel.DataModelOfExerciesTypeTwo

class HeroViewModel : ViewModel() {


    val fullBody = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfChest = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfTriceps = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfBack = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfBiceps = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfShoulder = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfLeg = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfAbs = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfAdon = ArrayList<DataModelOfExerciesTypeTwo>()

    private val setOfExercise: String = "3 Set x 12 Rep"


    fun setDataB() {

        //Fullbody...................///////////////////////////
        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Full Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )
        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Fu.... Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )
        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Fu..... Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )
        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Full1111 Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )

        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Full2222 Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )
        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Full Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )
        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Full Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )
        fullBody.add(
            DataModelOfExerciesTypeTwo(
                "Full Body",
                "4 Set x 12 Rep",
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )

        ////////////////////////////.................CHEST................//////////////////////////////////////////////////////////
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Push Up",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Barbell Bench Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Barbell Incline Bench Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Barbell Decline Bench Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc20.jpg?alt=media&token=db307531-9511-4724-ba1c-a5de808937fb"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Dumbbell Bench Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc24.jpg?alt=media&token=7aa2d1c0-95d2-489f-a7b7-17dbc6ddcb27"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Dumbbell Incline Bench Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc15.jpg?alt=media&token=56c0311d-a7e1-4e47-a372-612d19e94244"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Dumbbell Decline Bench Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc17.jpg?alt=media&token=a83a0424-e9b0-4e81-88b0-dde4b4e6a700"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Dumbbell Fly",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc20.jpg?alt=media&token=db307531-9511-4724-ba1c-a5de808937fb"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Cable Fly",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc24.jpg?alt=media&token=7aa2d1c0-95d2-489f-a7b7-17dbc6ddcb27"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Dumbbell Lying Hammer Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc23.jpg?alt=media&token=ce9fe72e-d129-40b0-8373-f98c1aa286a7"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Lever Pec Deck Fly",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc24.jpg?alt=media&token=7aa2d1c0-95d2-489f-a7b7-17dbc6ddcb27"
            )
        )
        arrayListOfChest.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
//////////////////////////////
        arrayListOfTriceps.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
///////////////////////
        arrayListOfBack.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )

        ////


        arrayListOfBiceps.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
///////////////////////////
        arrayListOfShoulder.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
////////////////////////
        arrayListOfLeg.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
//////////////////////////
        arrayListOfAbs.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )
///////////////////////////////
        arrayListOfAdon.add(
            DataModelOfExerciesTypeTwo(
                "Lever Chest Press",
                setOfExercise,
                "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"
            )
        )


    }

}