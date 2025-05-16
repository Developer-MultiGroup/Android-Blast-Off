package com.emreozcan.kotlinmodernprogramming.oop.inheritance

fun main() {
    val admin = Admin("Emre Özcan", "123456")
    println(admin.getPermissions())

    val user = User("John Doe")
    println(user.getPermissions())

    println(admin.name)
    println(user.name)
}