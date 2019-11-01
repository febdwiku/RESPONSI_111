package com.example.responsi_111

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi_111.Adapter.ListMinumanAdapter
import com.example.responsi_111.Model.Minuman
import com.example.responsi_111.Model.MinumanData
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    private lateinit var rvMinuman: RecyclerView
    private var list: ArrayList<Minuman> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvMinuman= findViewById(R.id.rv_minuman)
        rvMinuman.setHasFixedSize(true)
        list.addAll(MinumanData.listMinuman)
        showMinumanList()
        val tampung_lagi_nama : String? = intent.getStringExtra("Nama")
        val tampung_lagi_telp : String? = intent.getStringExtra("Telp")
        val tampung_lagi_username : String? = intent.getStringExtra("Username")
        val tampung_lagi_password : String? = intent.getStringExtra("Password")

        tVinfo.setOnClickListener(){
            intent = Intent (this, Info_profile::class.java)
            intent.putExtra("Nama", tampung_lagi_nama.toString())
            intent.putExtra("Telp", tampung_lagi_telp.toString())
            intent.putExtra("Username", tampung_lagi_username.toString())
            intent.putExtra("Password", tampung_lagi_password.toString())
            startActivity(intent)
        }
    }





    private fun showMinumanList() {
        rvMinuman.layoutManager = LinearLayoutManager(this)
        val listMinumanAdapter = ListMinumanAdapter(list)
        rvMinuman.adapter = listMinumanAdapter
    }


}
