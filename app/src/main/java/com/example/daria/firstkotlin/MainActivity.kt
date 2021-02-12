package com.example.daria.firstkotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val colores = listOf(Color.RED, Color.rgb(253, 106, 2), Color.YELLOW, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA)
        val num = number.text.toString()
        var count: Int = Integer.parseInt(num)
        count = (count + 1) % 100
        number.text = count.toString()
        number.setTextColor(colores[count % 7])
    }
}
