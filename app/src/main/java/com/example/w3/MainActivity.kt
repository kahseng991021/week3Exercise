package com.example.w3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

//import ui (button ,listbox)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()

       /* box_two_text.setOnClickListener(){
            makeColored(it)
        }
        box_three_text.setOnClickListener(){
            makeColored(it)
        }
        box_four_text.setOnClickListener(){
            makeColored(it)
        }
        box_five_text.setOnClickListener(){
            makeColored(it)
        }*/


    }

    private fun setListeners()
    {
        //val boxOneText = findViewById<TextView>(R.id.box_one_text) we need this to define the id
        val redbutton = findViewById<TextView>(R.id.red_button)
        val greenbutton = findViewById<TextView>(R.id.green_button)
        val yellowbutton = findViewById<TextView>(R.id.yellow_button)
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, rootConstraintLayout,redbutton,greenbutton,yellowbutton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View) {
        //when = switch below are the case (rid > xxxx)
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
    private fun setbackground()
    {
        //R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_two)

    }
}
