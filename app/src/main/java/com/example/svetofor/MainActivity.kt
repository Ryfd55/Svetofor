package com.example.svetofor

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
            val textView: TextView = findViewById(R.id.textView)
            val redButton: Button = findViewById(R.id.button_red)
            val yellowButton: Button = findViewById(R.id.button_yellow)
            val greenButton: Button = findViewById(R.id.button_green)


            redButton.setOnClickListener {

                textView.text ="Красный"
                val phrases = listOf(
                    "Улица",
                    "Аптека",
                    "Фонарь",
                    "Ночь")
                val shuffledList = phrases.shuffled()
                redButton.text = shuffledList[0]
                yellowButton.text = shuffledList[1]
                greenButton.text = shuffledList[2]
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    rootLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
                }
            }
            yellowButton.setOnClickListener {
                textView.text = "Желтый"
                rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor))
                redButton.text = "Красный"
                yellowButton.text = "Желтый"
                greenButton.text = "Зеленый"
            }
            greenButton.setOnClickListener {
                textView.text = "Зеленый"
                rootLayout.setBackgroundColor(Color.GREEN)
                redButton.text = "Красный"
                yellowButton.text = "Желтый"
                greenButton.text = "Зеленый"
            }
        }
}

