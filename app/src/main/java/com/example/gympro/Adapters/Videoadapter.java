package com.example.gympro.Adapters;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gympro.ItemViewModel.Videomodel;
import com.example.gympro.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Videoadapter extends FirebaseRecyclerAdapter<Videomodel, Videoadapter.myviewholder>
{

    public Videoadapter(@NonNull FirebaseRecyclerOptions<Videomodel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull Videomodel model) {
         holder.setdata(model);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_video_row,parent,false);
        return new myviewholder(view);
    }


    class myviewholder extends RecyclerView.ViewHolder
    {
        VideoView videoView;
        TextView title,desc;
        ProgressBar pbar;

        public myviewholder(@NonNull View itemView)
        {
            super(itemView);

            videoView= itemView.findViewById(R.id.videoView);
            title= itemView.findViewById(R.id.textVideoTitle);
            desc= itemView.findViewById(R.id.textVideoDescription);
            pbar= itemView.findViewById(R.id.videoProgressBar);
        }

        void setdata(Videomodel obj)
        {
            videoView.setVideoPath(obj.getUrl());
            title.setText(obj.getTitle());
            desc.setText(obj.getDesc());

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    pbar.setVisibility(View.GONE);
                    mediaPlayer.start();
                }
            });

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });
        }
    }

}
