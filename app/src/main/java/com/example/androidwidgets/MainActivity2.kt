package com.example.androidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        start.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val gelenIlerleme = seekBar.progress
            val gelenOylama = ratingBar.rating

            Log.e("İlerleme", gelenIlerleme.toString())
            Log.e("Oylama", gelenOylama.toString())
        }
        stop.setOnClickListener {
            progressBar.visibility = View.INVISIBLE
        }


        seekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                seek_text.text = "Sonuç : $progress"
            }

            override fun onStartTrackingTouch(seek: SeekBar) {

            }

            override fun onStopTrackingTouch(seek: SeekBar) {

            }
        })

        web_view.setOnClickListener {
            val gecis = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(gecis)
        }

    }
}


