package com.rachael.whatsappclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class listOfFriendsAdapter(val context: Context) : RecyclerView.Adapter<listOfFriendsAdapter.LFViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LFViewHolder {
       val itemView = LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent, false)

        return LFViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LFViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

    class LFViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }
}