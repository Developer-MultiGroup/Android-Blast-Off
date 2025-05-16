package com.emreozcan.kotlinmodernprogramming.oop.abstraction

abstract class Notification(val recipient: String) {

    abstract fun send()

    fun log() {
        println("Notification sent to $recipient")
    }
}

class EmailNotification(recipient: String) : Notification(recipient) {
    override fun send() {
        println("Sending EMAIL to $recipient")
    }
}

class SmsNotification(recipient: String) : Notification(recipient) {
    override fun send() {
        println("Sending SMS to $recipient")
    }
}

