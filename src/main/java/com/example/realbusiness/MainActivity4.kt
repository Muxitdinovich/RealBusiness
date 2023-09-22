package com.example.realbusiness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
    fun onClickGoMani(view : View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
    fun onClickExit(view: View){

        finish()
    }
    fun onClickInfo(view : View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)

    }
    fun onClickCalendar(view : View) {
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)

    }
}