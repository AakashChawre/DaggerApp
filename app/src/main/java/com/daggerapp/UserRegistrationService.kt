package com.daggerapp

import javax.inject.Inject

// Constructor Injection
// Dagger Constructor Injection
class UserRegistrationService @Inject constructor (
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "aakashchavre@gmail.com", "User registered...")
    }
}