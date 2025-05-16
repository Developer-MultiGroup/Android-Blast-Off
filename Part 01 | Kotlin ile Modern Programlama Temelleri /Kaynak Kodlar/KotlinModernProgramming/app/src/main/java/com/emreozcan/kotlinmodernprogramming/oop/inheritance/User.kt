package com.emreozcan.kotlinmodernprogramming.oop.inheritance

open class User(val name: String) {

    open fun getPermissions(): String {
        return "Read-only access"
    }
}