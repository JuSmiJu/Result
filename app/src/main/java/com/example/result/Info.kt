package com.example.result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window

class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }

    fun pas(view: View){
        val pasIntent = Intent(this, Pasport::class.java)
        startActivity(pasIntent)
    }

    fun pers(view: View){
        val persIntent = Intent(this, MainActivity::class.java)
        startActivity(persIntent)
    }
}