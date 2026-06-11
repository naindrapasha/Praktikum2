package com.example.praktikum1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Latihan4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan4)

        val bt_proses = findViewById<Button>(R.id.bt_proses)
        val et_nama = findViewById<EditText>(R.id.et_nama)
        val etm_hasil = findViewById<EditText>(R.id.etn_hasil)

        bt_proses.setOnClickListener {
            val strValue: String = et_nama.text.toString()
            etm_hasil.append(strValue + "\n")
        }
    }
}