package com.daggerapp

import android.util.Log
import com.daggerapp.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email:String,password:String){
        Log.d(TAG,"user save successfully...")
    }
}