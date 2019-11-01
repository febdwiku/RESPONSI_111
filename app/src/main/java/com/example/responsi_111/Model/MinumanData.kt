package com.example.responsi_111.Model

import com.example.responsi_111.R

object MinumanData {
    private val minumanName = arrayOf(
        "GOOD DAY",
        "MARIMAS",
        "TEH KOTAK",
        "FANTA",
        "SPRITE",
        "TEBS",
        "GOLDA"
    )
    private val detail = arrayOf(
        "Minuman kopi instant enak yang pas dibuat jadi kopi panas atau kopi dingin",
        "Minuman serbuk buah pilihan asli Indonesia kaya vitamin serta mineral",
        "Minuman teh berkualitas dari pucuk daun teh pilihan",
        "Minuman ringan berkarbonasi rasa buah",
        "Minuman ringan dengan aroma rasa lemon-jeruk terkemuka di dunia",
        "Minuman teh berkarbonasi dengan soda maroon rasa aneka buah",
        "Minuman kopi dengan bahan utama biji kopi berkualitas terbaik"
    )
    private val minumanPoster = intArrayOf(
        R.drawable.minuman,
        R.drawable.minuman,
        R.drawable.minuman,
        R.drawable.minuman,
        R.drawable.minuman,
        R.drawable.minuman,
        R.drawable.minuman
    )
    val listMinuman: ArrayList<Minuman>
        get() {
            val list = arrayListOf<Minuman>()
            for (position in minumanName.indices) {
                val minuman = Minuman()
                minuman.name = minumanName[position]
                minuman.detail = detail[position]
                minuman.poster = minumanPoster[position]
                list.add(minuman)
            }
            return list
        }
}