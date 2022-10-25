package com.example.job20bowo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Siswa>()
    val listnama = arrayOf(
        "VIVI NUR AISYAH",
        "ZULFA SOFIANA",
        "AHMAD ARDHI SETIAWAN",
        "ANISATUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI W.",
        "DANUARDI WAHYU P.L",
        "DEVA BUDIYANA",
        "DWI FEBRI STIYANINGRUM",
        "EVA ROHAS",
        "FELIM EDI P."
    )

    val listnis = arrayOf(
        "3035",
        "3039",
        "2973",
        "2974",
        "2977",
        "2979",
        "2981",
        "2982",
        "2985",
        "2987",
        "2988",
    )
    lateinit var SiswaView: RecyclerView
    lateinit var siswaAdapter: siswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SiswaView = findViewById(R.id.SiswaView)
        SiswaView.layoutManager = LinearLayoutManager(this)

        for (i in listnama.indices) {
            list.add(Siswa(listnama[i], listnis[i]))
        }

        siswaAdapter = siswaAdapter(list)
        siswaAdapter.notifyDataSetChanged()
        SiswaView.adapter = siswaAdapter
    }
}