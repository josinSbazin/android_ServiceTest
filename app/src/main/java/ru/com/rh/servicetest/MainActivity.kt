package ru.com.rh.servicetest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { sticky() }
        button2.setOnClickListener { nonSticky() }
    }

    fun sticky() {
        startService(Intent(this, StickyService::class.java))
    }
    fun nonSticky() {
        startService(Intent(this, NotStickyService::class.java))
    }

}
