package com.platzi.platzistore

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_landing.view.*

/**
 * Created by moises on 19/03/18.
 */
class AdapterLanding(val data:List<ItemLanding>) : RecyclerView.Adapter<AdapterLanding.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(parent?.inflate(R.layout.item_landing))


    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindView(data[position])
    }

    override fun getItemCount(): Int = data.size

    class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        fun bindView(itemLanding : ItemLanding){
            with(itemLanding){
                itemView.textTitleItem.text = title
                itemView.textDescItem.text = description
                itemView.textPriceItem.text = "$ ${String.format("%.2f", price)}"
            }
        }
    }
}