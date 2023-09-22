package com.example.realbusiness


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val packageName = "android.resource://" + packageName + "/" + R.raw.real_kurs3
        val uri = Uri.parse(packageName)
        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
    }
    fun onClickGoMani(view : View){
        val intent = Intent(this, MainActivity10::class.java)
        startActivity(intent)

    }

}