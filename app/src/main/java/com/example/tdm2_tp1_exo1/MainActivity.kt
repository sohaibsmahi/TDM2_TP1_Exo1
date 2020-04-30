package com.example.tdm2_tp1_exo1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorPreference = ColorPreference(this)
        var color = colorPreference.getColor()
        ac1.setBackgroundColor(color)

        button3.setOnClickListener{
            val intent = Intent(this, Activity_1::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = Intent(this, Activity_2::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener{
            val intent = Intent(this, Activity_3::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val bgcolor = Color.BLUE
            ac1.setBackgroundColor(bgcolor)
            colorPreference.setColor(bgcolor)
        }
        button2.setOnClickListener {
            val bgcolor = Color.RED
            ac1.setBackgroundColor(bgcolor)
            colorPreference.setColor(bgcolor)
        }
        button6.setOnClickListener {
            val bgcolor = Color.GREEN
            ac1.setBackgroundColor(bgcolor)
            colorPreference.setColor(bgcolor)
        }

    }


}
