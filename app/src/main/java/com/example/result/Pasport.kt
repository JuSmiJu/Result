package com.example.result

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.view.Window
import com.example.result.R
import com.example.result.worker
import kotlinx.android.synthetic.main.activity_pasport.*

class Pasport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasport)
    }



    fun pers(view: View){
        val persIntent = Intent(this, worker::class.java)
        startActivity(persIntent)
    }
}