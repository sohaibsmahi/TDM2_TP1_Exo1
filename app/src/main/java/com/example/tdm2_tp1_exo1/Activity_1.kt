package com.example.tdm2_tp1_exo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_1.*

class Activity_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val colorPreference = ColorPreference(this)
        var color = colorPreference.getColor()
        ac2.setBackgroundColor(color)
    }
}
