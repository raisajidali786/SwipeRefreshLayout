package com.rsa.codewsa.swiperefreshlayout.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.rsa.codewsa.swiperefreshlayout.R

class MainActivity : AppCompatActivity() {

    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var mainTv : TextView
    private lateinit var btnSwipeWithRecycler : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inIt()
        swipeListener()
        clickListener()
    }

    private fun clickListener() {
        btnSwipeWithRecycler.setOnClickListener {
            startActivity(Intent(this,SwipeWithRecyclerActivity::class.java))
        }
    }

    private fun swipeListener() {

        swipeRefreshLayout.setOnRefreshListener {

            mainTv.text = "Refreshed Text"
            swipeRefreshLayout.isRefreshing = false

        }

    }

    private fun inIt() {

        swipeRefreshLayout = findViewById(R.id.main_refresh_layout)
        mainTv = findViewById(R.id.main_tv)
        btnSwipeWithRecycler = findViewById(R.id.btn_swipe_refresh)

    }
}