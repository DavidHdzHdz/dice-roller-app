package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    // we should use late init to avoid using nullable vars
    lateinit  var diceOneImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 'til here we can access to R class
        setContentView(R.layout.activity_main)
        val rollButton: Button =  findViewById(R.id.roll_button)
        // we can add listener and put functionality into the lambda like js
        rollButton.setOnClickListener { rollDice() }
        diceOneImage = findViewById(R.id.dice_one)
    }

    private fun rollDice() {
        diceOneImage.setImageResource(when(Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        })
    }
}
