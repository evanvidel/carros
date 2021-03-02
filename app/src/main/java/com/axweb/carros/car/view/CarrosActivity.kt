package com.axweb.carros.car.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.axweb.carros.R
import com.axweb.carros.brand.model.Marca
import com.axweb.carros.car.controller.CarController
import com.axweb.carros.car.model.Carro
import kotlinx.android.synthetic.main.activity_carros.*

class CarrosActivity : AppCompatActivity() {

    val controller = CarController(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carros)

        val dados = intent.extras
        val marca = dados?.getParcelable<Marca>("model")


        marca_carro.text = marca?.name

        controller.loadCarros(marca?.id ?: 0)

    }

    fun instanceList(listCarros: ArrayList<Carro>) {
        val llm = LinearLayoutManager(this)
        llm.orientation = LinearLayoutManager.VERTICAL
        list_carros.layoutManager = llm
        list_carros.adapter = CarrosAdapter(listCarros, this)

    }

}