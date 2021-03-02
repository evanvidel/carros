package com.axweb.carros.brand.view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axweb.carros.car.view.CarrosActivity
import com.axweb.carros.R
import com.axweb.carros.brand.model.Marca
import kotlinx.android.synthetic.main.item_marca.view.*

class MarcaListAdapter(val data: ArrayList<Marca>, val context: Context):RecyclerView.Adapter<MarcaListAdapter.MarcasViewHolder>() {

    class MarcasViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val name = itemView.name_marca

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarcasViewHolder {
        val infrater = LayoutInflater.from(parent.context)
        val view = infrater.inflate(R.layout.item_marca, parent, false)
         return MarcasViewHolder(view)
    }

    override fun onBindViewHolder(holder: MarcasViewHolder, position: Int) {
        val marca: Marca = data.get(position)
        holder.name.text = marca.name

        holder.itemView.setOnClickListener {
            val intent = Intent(context, CarrosActivity::class.java)
            intent.putExtra("model",marca)
            context.startActivity(intent)
        }
    }

        override fun getItemCount(): Int {
            return data.size
        }
    }