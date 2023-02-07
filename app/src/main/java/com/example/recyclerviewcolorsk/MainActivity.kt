package com.example.recyclerviewcolorsk

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val SIZE = 30

    private val colorsList = mutableListOf(Color.YELLOW, Color.RED, Color.GREEN, Color.MAGENTA, Color.WHITE, Color.CYAN, Color.DKGRAY)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = mutableListOf<Int>()

        for (i in 0 until SIZE){
            data.add(this.colorsList[Random.nextInt(this.colorsList.size)])
        }

        val rv = findViewById<RecyclerView>(R.id.rview)

        val colorAdapter = ColorAdapter(LayoutInflater.from(this))
        colorAdapter.submitList(data)

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter
    }
}