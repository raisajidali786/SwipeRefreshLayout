package com.rsa.codewsa.swiperefreshlayout.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rsa.codewsa.swiperefreshlayout.R

class SwipeTestAdapter(private val testArray : ArrayList<String>) : RecyclerView.Adapter<SwipeTestAdapter.SwipeVH>() {

    inner class SwipeVH(view : View) : RecyclerView.ViewHolder(view){
        val testTv = view.findViewById<TextView>(R.id.item_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipeVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_swipe_item,parent,false)
        return SwipeVH(view)
    }

    override fun onBindViewHolder(holder: SwipeVH, position: Int) {
        holder.testTv.text = testArray[position]
    }

    override fun getItemCount(): Int {
        return testArray.size
    }
}