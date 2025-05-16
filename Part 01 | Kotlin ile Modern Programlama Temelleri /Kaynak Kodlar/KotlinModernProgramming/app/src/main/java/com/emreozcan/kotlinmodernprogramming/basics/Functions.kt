package com.emreozcan.kotlinmodernprogramming.basics

fun main() {
    /*
    println("Hello from Kotlin!")
    println("Hello from Kotlin!")
    println("Hello from Kotlin!")
    println("Hello from Kotlin!")
    println("Hello from Kotlin!")

     */


    //greet()
    //greet()
    //greet()
    //greet()
    //greet()
    //greetWithName("Android")
    //greetWithName("Emre")
    //add(5,3)
    //println(add(5,3))
    //greetDefaultParameters()
    //greetDefaultParameters("Emre")
    sendMessage("Emre","Hi")
    sendMessage(message = "Hi", to = "Emre")
}

fun greet() {
    println("Hello from Kotlin!")
}

fun greetWithName(name: String) {
    println("Hello, $name!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//Default Parameters
fun greetDefaultParameters(name: String = "User") {
    println("Welcome, $name!")
}

//Named Arguments
fun sendMessage(to: String, message: String) {
    println("To: $to - Message: $message")
}