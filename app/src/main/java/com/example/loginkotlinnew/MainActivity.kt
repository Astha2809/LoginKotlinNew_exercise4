package com.example.loginkotlinnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var EMAIL_ARGS: String = "EMAILID"
    var PASSWORD_ARGS: String = "PASSWORD"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUi()


    }

    fun initUi() {
        setContentView(R.layout.activity_main)
        val editText_email = findViewById<EditText>(R.id.editText_email)
        val editText_password = findViewById<EditText>(R.id.editText_password)
        val submit_button = findViewById<Button>(R.id.button_submit)
        submit_button.setOnClickListener(View.OnClickListener {

            intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(EMAIL_ARGS, editText_email.text.toString())
            intent.putExtra(PASSWORD_ARGS, editText_password.text.toString())
            startActivity(intent)


        })

    }
}
