package com.example.androidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        switch1.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Log.e("Switch", "On")
            } else {
                Log.e("Switch", "Off")
            }

        }

        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->

            if (isChecked) {
                Log.e("Toogle", "On")
                Toast.makeText(applicationContext, "Doğru Seçim", Toast.LENGTH_SHORT).show()
            } else {
                Log.e("Toogle", "Off")
            }

        }

        button.setOnClickListener {
            val switchDurum = switch1.isChecked
            val toogleDurum = toggleButton.isChecked

            val radioButtonDurum = radioButton2.isChecked
            val radioButtonDurum2 = radioButton3.isChecked

            Log.e("Toogle Durum", toogleDurum.toString())
            Log.e("Switch Durum", switchDurum.toString())
            Log.e("Radio Button Durum", radioButtonDurum.toString())
            Log.e("Radio Button 2 Durum", radioButtonDurum2.toString())


        }

        progress_page.setOnClickListener {
            val intent: Intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}