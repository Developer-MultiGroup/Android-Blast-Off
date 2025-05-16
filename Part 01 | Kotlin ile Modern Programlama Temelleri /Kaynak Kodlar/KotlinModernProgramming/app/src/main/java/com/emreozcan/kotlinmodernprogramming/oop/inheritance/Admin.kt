package com.emreozcan.kotlinmodernprogramming.oop.inheritance

class Admin(name: String, password: String) : User(name) {
    override fun getPermissions(): String {
        return "Full access"
    }

    fun deleteUser(target: User) {
        println("${target.name} has been removed by admin.")
    }
}