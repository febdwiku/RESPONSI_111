package com.example.responsi_111

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_daftar.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tVdaftar.setOnClickListener(){
            intent = Intent(this, Daftar::class.java)
            startActivity(intent)
        }

        val username : EditText = findViewById(R.id.eTusername)
        val password : EditText = findViewById(R.id.eTpassword)

        val tampung_lagi_nama : String? = intent.getStringExtra("Nama")
        val tampung_lagi_telp : String? = intent.getStringExtra("Telp")
        val tampung_lagi_username : String? = intent.getStringExtra("Username")
        val tampung_lagi_password : String? = intent.getStringExtra("Password")

        btn_login.setOnClickListener(){
            var tes_username = username.getText().toString()
            var tes_password = password.getText().toString()

            if (tes_username.isEmpty()||tes_password.isEmpty()){
                Toast.makeText(this,"Masukan Username dan Password", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }else if(username.getText().toString() == intent.getStringExtra("Username")&& password.getText().toString()==intent.getStringExtra("Password")){
                intent = Intent(this, Home::class.java)
                intent.putExtra("Nama", tampung_lagi_nama.toString())
                intent.putExtra("Telp", tampung_lagi_telp.toString())
                intent.putExtra("Username", tampung_lagi_username.toString())
                intent.putExtra("Password", tampung_lagi_password.toString())
                startActivity(intent)
            }else{
                Toast.makeText(this,"Username dan Password salah", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
        }
    }
}
