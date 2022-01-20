package com.example.birthdaywish

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdaycard(view: View) {

        val name=editTextTextPersonName.editableText.toString()
        val intent=Intent(this,Birthdaygreetactivity::class.java)
        intent.putExtra(Birthdaygreetactivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}