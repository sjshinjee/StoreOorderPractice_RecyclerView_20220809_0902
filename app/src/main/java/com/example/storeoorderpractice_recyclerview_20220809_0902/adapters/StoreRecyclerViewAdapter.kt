package com.example.storeoorderpractice_recyclerview_20220809_0902.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.storeoorderpractice_recyclerview_20220809_0902.R
import com.example.storeoorderpractice_recyclerview_20220809_0902.datas.StoreData

class StoreRecyclerViewAdapter(
    val mContext: Context,
    val mList: List<StoreData>
) : RecyclerView.Adapter<StoreRecyclerViewAdapter.MyViewHolder>(){

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(item : StoreData){

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