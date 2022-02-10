package com.king.roomdatabase.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.king.roomdatabase.R
import com.king.roomdatabase.data.User
import kotlinx.android.synthetic.main.custom_item.view.*

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>(){

    private var userList = emptyList<User>()

    class MyViewHolder (ItemView: View): RecyclerView.ViewHolder(ItemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.id_txt.text = currentItem.id.toString()
        holder.itemView.firstName_txt.text = currentItem.firstName
        holder.itemView.lastName_txt.text = currentItem.lastName
        holder.itemView.age_txt.text = currentItem.age.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(user: List<User>){
        this.userList =user
        notifyDataSetChanged()
    }
}