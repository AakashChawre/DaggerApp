package com.daggerapp

import android.util.Log

class EmailService {
    fun sendEmail(to: String, from: String, body: String) {
        Log.d(Constants.TAG, "to:$to\nfrom:$from\nmessage:$body")
    }
}