package com.daggerapp

import dagger.Component

// This interface is connector
@Component
interface UserRegistrationComponent {

    // This method create an object of UserRegistrationService class.
    fun getUserRegistrationService(): UserRegistrationService

    // This method create an object of EmailService class.
    fun getEmailService(): EmailService

}