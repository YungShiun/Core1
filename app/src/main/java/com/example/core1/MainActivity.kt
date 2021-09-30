package com.example.core1

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var b1: Button? = null
    var b2: Button? = null
    var b3: Button? = null
    var t: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        t = findViewById<View>(R.id.score) as TextView
        b1 = findViewById<View>(R.id.sneeze) as Button

            b1!!.setOnClickListener {
                val mp: MediaPlayer = MediaPlayer.create(this, R.raw.male_sneeze)
                mp.start()

                val score: Int

                if (t!!.text.toString().toInt() - 1 > 0) {
                    score = t!!.text.toString().toInt() - 1
                    t!!.text = Integer.toString(score)


                } else {
                    score = 0
                    t!!.text = "0"
                }
                if (score <= 7 && score > 5) {
                    t!!.setTextColor(Color.BLUE)
                } else if (score <= 5) {
                    t!!.setTextColor(Color.RED)
                }
            }
            b2 = findViewById<View>(R.id.blownose) as Button
            b2!!.setOnClickListener {
                val mp: MediaPlayer = MediaPlayer.create(this, R.raw.human_nose_sniffing)
                mp.start()
                val score: Int
                if (t!!.text.toString().toInt() - 2 > 0) {
                    score = t!!.text.toString().toInt() - 2
                    t!!.text = Integer.toString(score)
                } else {
                    score = 0
                    t!!.text = "0"
                }
                if (score <= 7 && score > 5) {
                    t!!.setTextColor(Color.BLUE)
                } else if (score <= 5) {
                    t!!.setTextColor(Color.RED)
                }
            }
            b3 = findViewById<View>(R.id.takemedication) as Button
            b3!!.setOnClickListener {
                val score: Int
                if (t!!.text.toString().toInt() + 2 <= 10) {
                    score = t!!.text.toString().toInt() + 2
                    t!!.text = Integer.toString(score)
                } else {
                    score = 10
                    t!!.text = "10"
                }
                if (score > 7) {
                    t!!.setTextColor(Color.rgb(152, 152, 152))
                } else if (score > 5) {
                    t!!.setTextColor(Color.BLUE)
                }
            }
        }}