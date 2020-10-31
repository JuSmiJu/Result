package com.example.result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.result.Adapter
import com.example.result.Dobavlenie
import com.example.result.Pasport

class worker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(fill_fio(), fill_dolg(), fill_stat())

    }

    val fio:Array<String> = arrayOf("Васильев Василий Иванович", "Иванов Иван Васильевич", "Пупкин Валерий Леонидович")
    val dolg:Array<String> = arrayOf("Слесарь", "Моляр", "Строитель")
    val stat:Array<Boolean> = arrayOf(true, false, false)
    val num:Array<String> = arrayOf("12345", "54321", "23145")
    val koord:Array<String> = arrayOf("123.567", "654.345", "324.654")

    private fun fill_fio(): MutableList<String> {
        val data = mutableListOf<String>()
        for (i in fio) {
            data.add(i)
        }
        return data
    }

    private fun fill_dolg(): MutableList<String> {
        val data = mutableListOf<String>()
        for (i in dolg) {
            data.add(i)
        }
        return data
    }

    private fun fill_stat(): MutableList<Boolean> {
        val data = mutableListOf<Boolean>()
        for (i in stat) {
            data.add(i)
        }
        return data
    }

    fun pas(view: View){
        val pasIntent = Intent(this, Pasport::class.java)
        startActivity(pasIntent)
    }

    fun dobavit(view: View){
        val dobavitIntent = Intent(this, Dobavlenie::class.java)
        startActivity(dobavitIntent)
    }

    fun info(view: View){
        val infoIntent = Intent(this, Info::class.java)
        startActivity(infoIntent)
    }

    fun pers(view: View){
        val persIntent = Intent(this, worker::class.java)
        startActivity(persIntent)
    }
}
