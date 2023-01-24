package com.daggerapp

// Constructor injection
class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "aakashchavre@gmail.com", "User registered...")
    }
}