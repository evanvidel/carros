package com.axweb.carros.car.view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axweb.carros.R
import com.axweb.carros.car.model.Carro
import kotlinx.android.synthetic.main.item_carro.view.*

class CarrosAdapter(val list: ArrayList<Carro>, val context: Context): RecyclerView.Adapter<CarrosAdapter.CarrosViewHolder>() {


    class CarrosViewHolder(view: View): RecyclerView.ViewHolder(view) {


        val name = itemView.list_carros
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarrosViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val view = inflater.inflate(R.layout.item_carro,parent,false)

        return CarrosViewHolder(view)

    }

    override fun onBindViewHolder(holder: CarrosViewHolder, position: Int) {
        val carros = list.get(position)
        holder.name.text = carros.name

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailsActivity::class.java)

            intent.putExtra("model",carros)
            context.startActivity(intent)
        }





    }

    override fun getItemCount(): Int {
        return list.size
    }
}