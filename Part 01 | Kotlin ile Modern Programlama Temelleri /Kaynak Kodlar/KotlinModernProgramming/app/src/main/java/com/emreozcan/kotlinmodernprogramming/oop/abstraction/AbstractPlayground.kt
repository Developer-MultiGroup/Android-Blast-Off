package com.emreozcan.kotlinmodernprogramming.oop.abstraction

fun main() {
    val email = EmailNotification("emre@example.com")
    val sms = SmsNotification("555-1234")

    email.send()
    sms.send()

    email.log()
    sms.log()
}