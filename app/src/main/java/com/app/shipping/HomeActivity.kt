package com.app.shipping

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.app.shipping.Adapter.newFestivalAdapter
import com.example.festival.CategoryItem
import com.example.festival.Retrofit.ApiClient
import com.example.festival.festival
import com.example.festival.new_post_details_image
import com.example.festival.newfestivallist
import retrofit2.Call
import retrofit2.Response

class HomeActivity : AppCompatActivity() {

    lateinit var recShippList: RecyclerView
    var newfestivallist: ArrayList<newfestivallist> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recShippList = findViewById(R.id.recShippList)

        loadnewfestival()

        /*  val data = ArrayList<ShippingListModel>()

          data.add(ShippingListModel(0, "Bernard Schuttevaer"))
          data.add(ShippingListModel(1, " Karel Schuttevaer"))
          data.add(ShippingListModel(2, "Bastiaan van Achterbergh"))
          data.add(ShippingListModel(3, "Anouk van Craeymeersch"))
          data.add(ShippingListModel(4, "Dylan Reeskamp"))
          data.add(ShippingListModel(5, "Bernard Schuttevaer"))
          data.add(ShippingListModel(6, " Karel Schuttevaer"))
          data.add(ShippingListModel(7, "Anouk van Craeymeersch"))

  */
        /*      val adapter = ShippingListAdapter(this, data)
              // Setting the Adapter with the recyclerview
              recShippList.adapter = adapter
      */

    }
    private fun loadnewfestival() {

        val token = "297ce2bdd8e08fb9a5d54a725cb356a78b284dd2161b5aef1c96a3cade498c71"

        /*  globall = Global.instance
          val token= globall.token
  */

        val getsliderClass = ApiClient.apiInterface.getNewFestival(token)
        getsliderClass.enqueue(object : retrofit2.Callback<festival> {
            @SuppressLint("LongLogTag")

            override fun onResponse(call: Call<festival>, response: Response<festival>) {

                if (response.body()!!.festival.isNullOrEmpty()) {

                    Toast.makeText(
                        this@HomeActivity,
                        "Not data Added" + response.body()!!.festival,
                        Toast.LENGTH_SHORT
                    )
                        .show()

                } else {

                    newfestivallist = response.body()!!.festival
                    val adapterData = newFestivalAdapter(this@HomeActivity!!, newfestivallist)
                    recShippList.adapter = adapterData

                }
            }

            override fun onFailure(call: Call<festival>, t: Throwable) {
                Toast.makeText(this@HomeActivity, t.message, Toast.LENGTH_SHORT).show()
            }
        }
        )
    }


}