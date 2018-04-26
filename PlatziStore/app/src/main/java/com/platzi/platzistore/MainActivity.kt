package com.platzi.platzistore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        itemList.layoutManager = GridLayoutManager(this, 2)

        val itemsShop = (0..20).map {
            ItemLanding("Título $it", "Descripción $it", 200.00 + it)
        }

        val adapter = AdapterLanding(itemsShop)

        itemList.adapter = adapter
    }
}
