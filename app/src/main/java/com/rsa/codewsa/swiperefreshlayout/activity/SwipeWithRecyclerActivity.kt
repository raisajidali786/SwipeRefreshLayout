package com.rsa.codewsa.swiperefreshlayout.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.rsa.codewsa.swiperefreshlayout.R
import com.rsa.codewsa.swiperefreshlayout.adapter.SwipeTestAdapter

class SwipeWithRecyclerActivity : AppCompatActivity() {

    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var swipeRecyclerView: RecyclerView
    private lateinit var adapter: SwipeTestAdapter
    private lateinit var testArray: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_with_recycler)
        inIt()
        addData()
        setAdapter()
        swipeListener()

    }

    private fun swipeListener() {
        swipeRefreshLayout.setOnRefreshListener {

            addMoreData()
            adapter.notifyDataSetChanged()

            swipeRefreshLayout.isRefreshing = false

        }
    }

    private fun addMoreData(){
        testArray.add("grapes")
        testArray.add("guava")
    }

    private fun addData() {
        testArray.add("apple")
        testArray.add("mango")
        testArray.add("banana")
    }

    private fun setAdapter() {

        adapter = SwipeTestAdapter(testArray)
        swipeRecyclerView.layoutManager = LinearLayoutManager(this)
        swipeRecyclerView.adapter = adapter

    }

    private fun inIt() {
        swipeRefreshLayout = findViewById(R.id.swipe_refresh_layout)
        swipeRecyclerView = findViewById(R.id.swipe_recycler)
        testArray = ArrayList()
    }
}