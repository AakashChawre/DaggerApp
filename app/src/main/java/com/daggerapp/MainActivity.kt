package com.daggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // Dagger Field injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This code is not perfect.

        /*val userRegistrationService = UserRegistrationService()
        userRegistrationService.registerUser("aakashchavre@gmail.com","11111")*/

    }

    override fun onResume() {
        super.onResume()

        // Manual dependency injection
        // Field injection

        /*val userRepository = UserRepository()
        val emailService = EmailService()
        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        userRegistrationService.registerUser("aakashchavre@gmail.com", "11111")*/

        // Add Dagger dependency injection.
        // Dagger will generate this object of DaggerUserRegistrationComponent interface.
        val component = DaggerUserRegistrationComponent.builder().build()

        // get object of class using component.
        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()

        userRegistrationService.registerUser("aakashchavre@gmail.com", "11111")
        emailService.sendEmail("aakashchavre@gmail.com", "mohitsharma@gmail.com","Hello")



    }
}