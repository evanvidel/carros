package com.axweb.carros.brand.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.axweb.carros.R
import com.axweb.carros.brand.controller.MainController
import com.axweb.carros.brand.model.Marca
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val controller = MainController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        controller.loadMarcas()
    }

    fun instanceList(listMarcas: ArrayList<Marca>) {
        val llm = LinearLayoutManager(this)
        llm.orientation = LinearLayoutManager.VERTICAL
        list_marcas.layoutManager = llm
        list_marcas.adapter = MarcaListAdapter(listMarcas, this)
    }

}



