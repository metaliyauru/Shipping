package com.weddingcard.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.shipping.R
import com.app.shipping.ShippingListModel
import com.google.android.material.textview.MaterialTextView



class ShippingListAdapter(
    private var context: Context,
    private var arrayList: ArrayList<ShippingListModel>
) : RecyclerView.Adapter<ShippingListAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.shipnamelist, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = arrayList[position]

        // sets the text to the textview from our itemHolder class

        holder.txtName.text = itemsViewModel.Name

      /*  holder.itemView.setOnClickListener {

            var intent = Intent(context, CategoryTemplateActivity::class.java)
            intent.putExtra("catId", itemsViewModel.catId)
            intent.putExtra("isFrom", itemsViewModel.catName)
            intent.putExtra("catName", itemsViewModel.catName)
            context.startActivity(intent)

        }*/
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return arrayList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val txtName: MaterialTextView = itemView.findViewById(R.id.txtName)


    }


}