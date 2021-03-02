package com.axweb.carros.brand.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.json.JSONObject


@Parcelize
data class Marca (
   var name: String = "",
   var fipe_name: String = "",
   var order: Int = 0,
   var key: String = "",
   var id: Int = 0

) : Parcelable {

   fun init(item:JSONObject) {
      name = item.getString("name")
      fipe_name = item.getString("fipe_name")
      order = item.getInt("order")
      key = item.getString("key")
      id = item.getInt("id")
   }
}


