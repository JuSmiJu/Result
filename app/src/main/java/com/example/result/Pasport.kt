package com.example.result

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.view.Window
import android.widget.ArrayAdapter
import com.example.result.R
import com.example.result.worker
import kotlinx.android.synthetic.main.activity_pasport.*
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream
import android.widget.ListAdapter as ListAdapter1

class Pasport : AppCompatActivity() {

    var arr_name_org = arrayListOf<String>()
    var arr_ogrn = arrayListOf<String>()
    var arr_inn = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasport)
        read_json()
    }

    @SuppressLint("SetTextI18n")
    fun read_json() {
        var json : String? = null

        try {
//            val storageDir = getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)
            // Toast.makeText(applicationContext, storageDir.toString(), Toast.LENGTH_LONG).show()
            val inputStream: InputStream = assets.open("Org.json")
            json = inputStream.bufferedReader().use{it.readText()}

            val jsonarr = JSONArray(json)

            for (i in 0 until jsonarr.length()) {
                val jsonobj = jsonarr.getJSONObject(i)
                arr_name_org.add(jsonobj.getString("name_org"))
                arr_ogrn.add(jsonobj.getString("ogrn"))
                arr_inn.add(jsonobj.getString("inn"))
            }

            pass_name.text = "Название:  " + arr_name_org[0]
            pass_ogrn.text = "ОГРН:  " + arr_ogrn[0]
            pass_inn.text = "ИНН:  " + arr_inn[0]

        }
        catch (e : IOException) {

        }

    }

    fun pers(view: View){
        val persIntent = Intent(this, worker::class.java)
        startActivity(persIntent)
    }
}