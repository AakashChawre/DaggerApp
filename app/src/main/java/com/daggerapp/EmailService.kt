package com.daggerapp

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(to: String, from: String, body: String) {
        Log.d(Constants.TAG, "to:$to\nfrom:$from\nmessage:$body")
    }
}