package com.example.loginkotlinnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    var EMAIL_ARGS: String = "EMAILID"
    var PASSWORD_ARGS: String = "PASSWORD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initUi()

    }

    fun initUi() {
        val textview_email = findViewById<TextView>(R.id.textview_email)
        val textView_password = findViewById<TextView>(R.id.textview_password)
        val email = intent.getStringExtra(EMAIL_ARGS)
        val password = intent.getStringExtra(PASSWORD_ARGS)


        textview_email.text = email
        textView_password.text = password


    }
}
