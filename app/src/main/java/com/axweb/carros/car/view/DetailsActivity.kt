package com.axweb.carros.car.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axweb.carros.R
import com.axweb.carros.car.model.Carro
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val extras = intent.extras
        val carro = extras?.getParcelable<Carro>("model")

        name_value.text = carro?.name


    }
}