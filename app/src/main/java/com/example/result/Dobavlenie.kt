package com.example.result


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.EditText
import com.example.result.R
import com.example.result.worker

class Dobavlenie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dobavlenie)
    }

    fun pas2(view: View){
        val pas2Intent = Intent(this, Pasport::class.java)
        startActivity(pas2Intent)
    }

    fun pers2(view: View){
        val pers2Intent = Intent(this, worker::class.java)
        startActivity(pers2Intent)
    }

    fun dob(view: View){
        val dobIntent = Intent(this, worker::class.java)

//        val fio = findViewById<EditText>(R.id.FIO).text.toString()
//        val dolgnost = findViewById<EditText>(R.id.Dolgnost).text.toString()
//        val nomer = findViewById<EditText>(R.id.Nomer).text.toString()

        startActivity(dobIntent)
    }

    fun otm(view: View){
        val otmIntent = Intent(this, Dobavlenie::class.java)
        startActivity(otmIntent)
    }
}