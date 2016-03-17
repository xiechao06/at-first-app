package com.xc.at_first_app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView = TextView(this)
        textView.text = message;
        textView.textSize = 40.0F;

        (findViewById(android.R.id.content) as ViewGroup).addView(textView)
    }

}