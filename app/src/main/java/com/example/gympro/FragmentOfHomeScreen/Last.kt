package com.example.gympro.FragmentOfHomeScreen

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.gympro.Adapters.AdapterofExerciseItemTwo
import com.example.gympro.R

class Last : Fragment() {
    lateinit var videoview: VideoView
    var position: Int = 0
    var path:String=""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_last, container, false)

//        videoview = view.findViewById(R.id.videoView)
//
//        position = arguments?.getInt("RRRB")!!.toInt()
//        path=arguments?.getString("Apple")!!.toString()
//
//
//        if (path=="Full Body")
//        {
//
//            if (position==0)
//            {
//               // LoadExerciseVideo()
//                Toast.makeText(context,"1-1",Toast.LENGTH_SHORT).show()
//
//            }
//        }






  //---------------------------------------------------------------------
//       val path = "android.resource://" + requireContext().packageName + "/" + R.raw.video
//        videoview.setVideoURI(Uri.parse(path))
//        videoview.start()
//
//        videoview.setOnCompletionListener {
//            videoview.start()
//
//        }
//
//        videoview.setOnPreparedListener { mediaPlayer ->
//            videoview.seekTo(1) // for video preview
//            mediaPlayer.playbackParams = mediaPlayer.playbackParams.apply {
//                speed =2f
//            }
//            videoview.start()
//        }

        return view


    }


//    fun LoadExerciseVideo()
//
//    {
//
//        val path = "android.resource://" + requireContext().packageName + "/" + R.raw.video
//        videoview.setVideoURI(Uri.parse(path))
//        videoview.start()
//
//        videoview.setOnCompletionListener {
//            videoview.start()
//
//        }
//
//        videoview.setOnPreparedListener { mediaPlayer ->
//            videoview.seekTo(1) // for video preview
//            mediaPlayer.playbackParams = mediaPlayer.playbackParams.apply {
//                speed =2f
//            }
//            videoview.start()
//        }
//    }

}