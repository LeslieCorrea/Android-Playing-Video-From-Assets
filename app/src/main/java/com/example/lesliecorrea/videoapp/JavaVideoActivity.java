package com.example.lesliecorrea.videoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class JavaVideoActivity extends AppCompatActivity {

    VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_video);

        mVideoView = (VideoView) this.findViewById(R.id.SampleVideoView);
        MediaController mediaController = new MediaController(this);
        mVideoView.setMediaController(mediaController);
        mVideoView.setVideoPath("content://com.example.lesliecorrea.videoapp/big_buck_bunny.mp4");
        mVideoView.start();
    }
}
