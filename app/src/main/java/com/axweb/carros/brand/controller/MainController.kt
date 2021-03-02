package com.axweb.carros.brand.controller

import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.axweb.carros.brand.model.Marca
import com.axweb.carros.brand.view.MainActivity

class MainController(val main: MainActivity) {


    fun loadMarcas() {
        val url = "http://fipeapi.appspot.com/api/1/carros/marcas.json"
        val jar = JsonArrayRequest(url, {
            val listMarcas = ArrayList<Marca>()
            for (i in 0 until it.length()) {
                val item = it.getJSONObject(i)

                val marca = Marca()
                marca.init(item)

                listMarcas.add(marca)
            }
            main.instanceList(listMarcas)
        }, {
            it.printStackTrace()
        })
        Volley.newRequestQueue(main).add(jar)
    }
}