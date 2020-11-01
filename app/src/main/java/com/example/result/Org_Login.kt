package com.example.result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Org_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_org__login)
    }

    fun but_log(view: View){
        val but_logIntent = Intent(this, worker::class.java)
        startActivity(but_logIntent)
    }
}