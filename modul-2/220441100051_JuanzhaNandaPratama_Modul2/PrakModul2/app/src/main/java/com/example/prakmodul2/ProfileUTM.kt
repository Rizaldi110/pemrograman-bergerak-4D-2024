package com.example.prakmodul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileUTM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_utm)
    }
    fun toLogin(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}