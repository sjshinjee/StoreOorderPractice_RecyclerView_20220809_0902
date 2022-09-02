package com.example.storeoorderpractice_recyclerview_20220809_0902.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.storeoorderpractice_recyclerview_20220809_0902.DetailStoreActivity
import com.example.storeoorderpractice_recyclerview_20220809_0902.R
import com.example.storeoorderpractice_recyclerview_20220809_0902.datas.StoreData
import com.willy.ratingbar.ScaleRatingBar

class StoreRecyclerViewAdapter(
    val mContext: Context,
    val mList: List<StoreData>
) : RecyclerView.Adapter<StoreRecyclerViewAdapter.MyViewHolder>(){

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(item : StoreData){
            val titleTxt = itemView.findViewById<TextView>(R.id.titleTxt)
            val storeImg = itemView.findViewById<ImageView>(R.id.storeImg)
            val scaleRatingBar = itemView.findViewById<ScaleRatingBar>(R.id.scoreRatingBar)

            titleTxt.text = item.title
            Glide.with(mContext)
                .load(item.imageUri)
                .into(storeImg)
            scaleRatingBar.rating = item.score.toFloat()

            itemView.setOnClickListener {
                val myIntent = Intent(mContext, DetailStoreActivity::class.java)
                myIntent.putExtra("storeData", item)
                mContext.startActivity(myIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.stroe_list_item, parent,false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}