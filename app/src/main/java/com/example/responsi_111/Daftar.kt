package com.example.responsi_111

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_daftar.*

class Daftar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val nama : EditText = findViewById<EditText>(R.id.eTnamalengkapdaftar)
        val telp : EditText = findViewById<EditText>(R.id.eTphonedaftar)
        val username : EditText = findViewById<EditText>(R.id.eTusernamedaftar)
        val password : EditText = findViewById<EditText>(R.id.eTpassworddaftar)

        btn_daftar.setOnClickListener(){


            var tes_nama = nama.getText().toString()
            var tes_telp = telp.getText().toString()
            var tes_username = username.getText().toString()
            var tes_password = password.getText().toString()



            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Nama", nama.getText().toString())
            intent.putExtra("Telp",telp.getText().toString())
            intent.putExtra("Username",username.getText().toString())
            intent.putExtra("Password",password.getText().toString())

            if (tes_nama.isEmpty()||tes_telp.isEmpty()||tes_username.isEmpty()||tes_password.isEmpty()) {
                Toast.makeText(this, "Harap Isi Semua", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Toast.makeText(this,"Anda Berhasil Mendaftar",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }
    }
}
