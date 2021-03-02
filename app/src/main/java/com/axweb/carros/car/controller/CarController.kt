package com.axweb.carros.car.controller

import android.util.Log
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.axweb.carros.car.model.Carro
import com.axweb.carros.car.view.CarrosActivity


class CarController(val main: CarrosActivity ) {


fun loadCarros(id: Int) {

    val url = "http://fipeapi.appspot.com/api/1/carros/veiculos/" + id + ".json"
    val jar = JsonArrayRequest(url, {
        val listCarros = ArrayList<Carro>()

        for (i in 0 until it.length()) {
            val item = it.getJSONObject(i)

            val carro = Carro()
            carro.init(item)
            listCarros.add(carro)
        }

        main.instanceList(listCarros)

    }, {
        it.printStackTrace()
    })

    Volley.newRequestQueue(main).add(jar)
    }
}