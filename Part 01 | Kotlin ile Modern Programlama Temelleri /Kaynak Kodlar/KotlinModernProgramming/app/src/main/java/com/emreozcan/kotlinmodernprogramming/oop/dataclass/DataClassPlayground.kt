package com.emreozcan.kotlinmodernprogramming.oop.dataclass


fun main() {
    val user1 = User("Emre", 25)
    println("USER1: ${user1.toString()}")

    val user2 = user1.copy(age = 35)
    val user3 = user1.copy()

    println("USER2: $user2")
    println("USER3: $user3")

    println("USER1 EQUAL TO USER2 -> ${user1 == user2}")
    println("USER1 EQUAL TO USER3 -> ${user1 == user3}")
}