package com.example.responsi_111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_info_profile.*

class Info_profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_profile)

        val tampung_lagi_nama : String? = intent.getStringExtra("Nama")
        val tampung_lagi_telp : String? = intent.getStringExtra("Telp")
        val tampung_lagi_username : String? = intent.getStringExtra("Username")
        val tampung_lagi_password : String? = intent.getStringExtra("Password")

        tVnamalengkap_info1.text=""+tampung_lagi_nama
        tVtelp_info1.text=""+tampung_lagi_telp
        tVusername_info1.text=""+tampung_lagi_username
        tVpassword_info1.text=""+tampung_lagi_password
    }
}
