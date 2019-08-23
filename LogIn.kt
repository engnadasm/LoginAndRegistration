package com.example.form

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent



class LogIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        title = "LOG_IN"
    }

    fun btn_signup(view: View) {
        val tutorialPage = Intent(this, SignUp::class.java)
        startActivity(tutorialPage)
    }

}
