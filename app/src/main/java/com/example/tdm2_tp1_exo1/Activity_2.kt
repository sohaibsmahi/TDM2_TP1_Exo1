package com.example.tdm2_tp1_exo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val colorPreference = ColorPreference(this)
        var color = colorPreference.getColor()
        ac3.setBackgroundColor(color)
    }
}
