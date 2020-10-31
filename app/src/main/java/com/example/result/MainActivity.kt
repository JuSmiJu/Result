package com.example.result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.registr.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but_log.setOnClickListener { showLogin() }

        but_reg.setOnClickListener { showReg() }

        log_log.setOnClickListener {startActivity(Intent(this, worker::class.java)) }

        reg_reg.setOnClickListener {

//            val reg_json = JSONObject()
//            reg_json.put("name", reg_name.text)
//            reg_json.put("ogrn", reg_ogrn.text)
//            reg_json.put("inn", reg_inn.text)
//            reg_json.put("login", reg_log.text)
//            reg_json.put("password", reg_pass.text)

//            val intent : Intent = Intent(this, Info::class.java)
//            intent.putExtra("reg_info", reg_json.toString())
//            startActivity(intent)


            startActivity(Intent(this, worker::class.java)) }
    }


    private fun showLogin() {
        login.visibility= View.VISIBLE
        registr.visibility= View.GONE
    }

    private fun showReg() {
        login.visibility= View.GONE
        registr.visibility= View.VISIBLE
    }
}

