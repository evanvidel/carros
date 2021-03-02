package com.axweb.carros.car.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.json.JSONObject


@Parcelize
class Carro (
    var fipe_marca:String = "",
    var name: String = "",
    var marca: String = "",
    var key: String = "",
    var id: String = "",
    var fipe_name: String = ""

   ): Parcelable {

       fun init(item:JSONObject) {
            fipe_marca = item.getString("fipe_marca")
            name = item.getString("name")
            marca = item.getString("marca")
            key = item.getString("key")
            id = item.getString("id")
            fipe_name = item.getString("fipe_name")
       }
   }
