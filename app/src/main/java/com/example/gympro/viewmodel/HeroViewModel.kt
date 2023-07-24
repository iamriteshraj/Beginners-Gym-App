package com.example.gympro.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gympro.ItemViewModel.DataModelOfExerciesTypeTwo
import com.example.gympro.R

class HeroViewModel : ViewModel() {


     val fullBody = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfChest = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfTriceps = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfBack = ArrayList<DataModelOfExerciesTypeTwo>()
    val arrayListOfBiceps = ArrayList<DataModelOfExerciesTypeTwo>()

    private val setOfExercise:String="3 Set x 12 Rep"


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
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Push Up",  setOfExercise,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc11.jpg?alt=media&token=3e6bc416-f7b3-4aec-ab13-086051d0c30b"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Barbell Bench Press",  setOfExercise,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Barbell Incline Bench Press", setOfExercise,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Barbell Decline Bench Press",  setOfExercise,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc20.jpg?alt=media&token=db307531-9511-4724-ba1c-a5de808937fb"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Dumbbell Bench Press",setOfExercise,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc24.jpg?alt=media&token=7aa2d1c0-95d2-489f-a7b7-17dbc6ddcb27"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Dumbbell Incline Bench Press",  setOfExercise,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc15.jpg?alt=media&token=56c0311d-a7e1-4e47-a372-612d19e94244"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Dumbbell Decline Bench Press",  setOfExercise, "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc17.jpg?alt=media&token=a83a0424-e9b0-4e81-88b0-dde4b4e6a700"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Dumbbell Fly",  setOfExercise, "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc20.jpg?alt=media&token=db307531-9511-4724-ba1c-a5de808937fb"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Cable Fly",  setOfExercise, "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc24.jpg?alt=media&token=7aa2d1c0-95d2-489f-a7b7-17dbc6ddcb27"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Dumbbell Lying Hammer Press",  setOfExercise, "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc23.jpg?alt=media&token=ce9fe72e-d129-40b0-8373-f98c1aa286a7"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Lever Pec Deck Fly",  setOfExercise,"https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc24.jpg?alt=media&token=7aa2d1c0-95d2-489f-a7b7-17dbc6ddcb27"))
        arrayListOfChest.add(DataModelOfExerciesTypeTwo("Lever Chest Press",  setOfExercise, "https://firebasestorage.googleapis.com/v0/b/ticktok-948a8.appspot.com/o/chest%20workout%20pic%2Fc25.jpg?alt=media&token=912a055c-dac6-48d1-a0a3-e51815f30e6c"))


        //////////////////////////////............................TRICEPS.........................
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("Cable Overhead Triceps Extension", " setOfExercise", R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("Cable Pushdown",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("cable rope highy pulley overhead",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("cable standing one arm Triceps extension",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("cable Triceps pushdown",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("Cable_Lying_Triceps_..._137_F",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("Dumbbell close grip press",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("Dumbbell one arm Triceps extension",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("Dumbbell seated Triceps extension",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("lever Triceps extension",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("lever triceps extension",  setOfExercise, R.drawable.full_body))
//        arrayListOfTriceps .add(DataModelOfExerciesTypeTwo("Stretching - kneeling trice extension",  setOfExercise, R.drawable.full_body))
//
//        /////////////////////////////////////////////....................BACK........................///////////////////////////////////////
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("pull ups",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("reverse grip machine lat pull down",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("Slever reverse T bar row",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("lever high row",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("lever - T bar row",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("Dumbbell incline row",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("dumbbell bent - over row",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable straight arm pull-down",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable seated row",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable seated row( parallel grip)",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable seated high row(v- row)",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable pull-downs",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable bsr pull-down",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable one arm lateral pull-down",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable one arm twisting seated row",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("cable pull-down",  setOfExercise, R.drawable.full_body))
//        arrayListOfBack .add(DataModelOfExerciesTypeTwo("barbell bent over row",  setOfExercise, R.drawable.full_body))
//
//
// ///////////////////////////////////...............BICEPS..........................///////////////////////////
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("barebell curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("barebell drag curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("barebell prone incline curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("cable one arm curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("cable standing inner curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("Dumbbell alternate biceps curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("Dumbbell Biceps curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("dumbbell concentration curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("Dumbbell cross body hammer curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("Dumbbell incline biceps curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("Dumbbell incline hammer curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("dumbbell seated preacher curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("EZ barebell curl",  setOfExercise, R.drawable.full_body))
//        arrayListOfBiceps .add(DataModelOfExerciesTypeTwo("lever preacher curl",  setOfExercise, R.drawable.full_body))


    }

}