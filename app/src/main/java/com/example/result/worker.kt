package com.example.result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.view.Window
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.result.Adapter
import com.example.result.Dobavlenie
import com.example.result.Pasport
import kotlinx.android.synthetic.main.rabotniki.*
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream

class worker : AppCompatActivity() {

    var arr_name = mutableListOf<String>()
    var arr_pos = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker)

        read_json()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(fill_fio(), fill_dolg(), fill_stat())
    }

    fun read_json() {
        var json : String? = null

        try {
//            val storageDir = getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)
            // Toast.makeText(applicationContext, storageDir.toString(), Toast.LENGTH_LONG).show()
            val inputStream: InputStream = assets.open("First.json")
            json = inputStream.bufferedReader().use{it.readText()}

            val jsonarr = JSONArray(json)

            for (i in 0 until jsonarr.length()) {
                val jsonobj = jsonarr.getJSONObject(i)
                arr_name.add(jsonobj.getString("name"))
                arr_pos.add(jsonobj.getString("position"))
            }

        }
        catch (e : IOException) {

        }

    }

    private fun fill_fio(): MutableList<String> {
        val data = mutableListOf<String>()
        for (i in arr_name) {
            data.add(i)
        }
        return data
    }

    private fun fill_dolg(): MutableList<String> {
        val data = mutableListOf<String>()
        for (i in arr_pos) {
            data.add(i)
        }
        return data
    }

    private fun fill_stat(): MutableList<Boolean> {
        val data = mutableListOf<Boolean>()
        for (i in arr_name) {
            data.add(true)
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
