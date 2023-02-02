package com.app.shipping.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.shipping.R
import com.bumptech.glide.Glide
import com.example.festival.newfestivallist
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class newFestivalAdapter(val context: Context,private val dataList : ArrayList<newfestivallist>):RecyclerView.Adapter<newFestivalAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newFestivalAdapter.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.newfestival_listdata,parent,false)
        return ViewHolder(v)

    }

    @SuppressLint("NewApi")
    override fun onBindViewHolder(holder: newFestivalAdapter.ViewHolder, position: Int) {

        val dataModel  : newfestivallist = dataList[position]

        val inFormat = SimpleDateFormat("dd-MM-yyyy")
        val date: Date = inFormat.parse(dataModel.fest_date)
        val outFormat = SimpleDateFormat("MMM dd")
        val goal: String = outFormat.format(date)

        //image set from dataList at particular position
        Glide.with(context).load(dataModel.fest_image).into(holder.festimage)

        holder.festdate.text=goal

        val new_fest_id = dataModel.fest_id
        val name = dataModel.fest_name

      /*  holder.itemView.setOnClickListener {

            val fest_details = Intent(context,NewFestivalDetailsActivity::class.java)

            fest_details.putExtra("name",name)
            fest_details.putExtra("new_fest_id",new_fest_id)

            context.startActivity(fest_details)

        }*/

    }

    override fun getItemCount(): Int {
        return  dataList.size
    }

    inner class ViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){

        var festimage : ImageView
        var festdate : TextView

        init {

            festimage=itemview.findViewById(R.id.image)
            festdate=itemview.findViewById(R.id.txtdate)
        }
    }
}