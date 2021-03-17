package com.example.pull_to_refresh

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
import com.example.pull_to_refresh.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var swipeRefreshLayout: SwipeRefreshLayout
    lateinit var textView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        swipeRefreshLayout = findViewById(R.id.swipe_container)
        textView = findViewById(R.id.tv)
        textView.text = "Refreshing..."

        swipeRefreshLayout.setOnRefreshListener {
            textView.text = "Refreshed"
            swipeRefreshLayout.isRefreshing = false
        }
    }
}