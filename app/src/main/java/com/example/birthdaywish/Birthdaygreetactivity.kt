package com.example.birthdaywish

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaygreetactivity.*

class Birthdaygreetactivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreetactivity)
        val name=intent.getStringExtra(NAME_EXTRA)
        birthdaygreet.text="Happy Bithday\n$name!"
    }

}