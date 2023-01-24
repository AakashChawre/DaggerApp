package com.daggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val userRegistrationService = UserRegistrationService()
        userRegistrationService.registerUser("aakashchavre@gmail.com","11111")
    }
}