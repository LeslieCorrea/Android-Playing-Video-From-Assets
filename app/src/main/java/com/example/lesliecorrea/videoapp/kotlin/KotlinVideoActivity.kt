package com.example.lesliecorrea.videoapp.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.MediaController
import android.widget.VideoView
import com.example.lesliecorrea.videoapp.R

class KotlinVideoActivity : AppCompatActivity() {

    lateinit var mVideoView : VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","onCreate")
        setContentView(R.layout.activity_main)
        mVideoView = findViewById(R.id.SampleVideoView) as VideoView
        val mediaController = MediaController(this)
        mVideoView.setMediaController(mediaController)
        mVideoView.setVideoPath("content://com.example.lesliecorrea.videoapp.kotlin/video.mp4")
        mVideoView.start()
    }
}
