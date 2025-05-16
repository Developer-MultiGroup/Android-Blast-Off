package com.emreozcan.kotlinmodernprogramming.oop


fun main() {
    val message = Message("Emre", "Hi", false)
    val messageTwo = Message("John Doe", "Welcome", true)

    message.getMessageInfo()
    messageTwo.getMessageInfo()
}