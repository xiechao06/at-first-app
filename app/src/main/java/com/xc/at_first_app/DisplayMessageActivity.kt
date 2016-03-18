package com.xc.at_first_app

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*
import kotlinx.android.synthetic.main.content_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        setSupportActionBar(findViewById(R.id.toolbar) as Toolbar)


        fab.setOnClickListener({ view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
        })
        // EQUIVALENT TO
        //        fab.setOnClickListener(View.OnClickListener {
        //            view ->
        //            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
        //        })
        // OR
                fab.setOnClickListener(object : View.OnClickListener {
                    override fun onClick(v: View?) {
                        Snackbar.make(v!!, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
                    }
                })

        var textView = TextView(this)
        textView.textSize = 40.0F
        textView.text = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        content.addView(textView)
    }

}
