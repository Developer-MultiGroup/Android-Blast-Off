package com.emreozcan.kotlinmodernprogramming.general.nullpart

fun main() {
    val age = 25
    var name: String? = null

    //println(name!!.length)

    var nickname: String? = null

    //Safe Call
    //println(nickname?.length)

    //Elvis operator
    //println(nickname?.length ?: 10)

    nickname = "eozcan"

    //println(nickname.length)

    // !! -> Double bang
    println(nickname!!.length)

    // ?.let {} -> Scope Functions
}