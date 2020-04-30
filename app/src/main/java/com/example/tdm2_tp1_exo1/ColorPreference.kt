package com.example.tdm2_tp1_exo1

import android.content.Context
import android.graphics.Color

class ColorPreference(context: Context){
    val NAME = "Color SharedPreference"
    val COLOR = "Background Color"

    val preference = context.getSharedPreferences(NAME, Context.MODE_PRIVATE)

    fun getColor(): Int{
        return preference.getInt(COLOR, Color.WHITE)
    }
    fun setColor(color:Int){
        val editor = preference.edit()
        editor.putInt(COLOR, color)
        editor.apply()
    }
}