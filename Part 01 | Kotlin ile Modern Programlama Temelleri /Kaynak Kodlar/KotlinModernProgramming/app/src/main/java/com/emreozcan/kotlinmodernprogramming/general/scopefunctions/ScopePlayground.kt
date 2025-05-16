package com.emreozcan.kotlinmodernprogramming.general.scopefunctions

fun main() {
    // ?.let {} null

    var data: String? = null

    if (data != null) {
        println(data.length)
    }

    data?.let {
        println(it.length)
    }

    data = "123456"

    data?.let {
        //println(it)
    }


    // ?.let aynı zamanda değer döndürebilir...

    // .apply nesneleri yapılandırma
    val user = User()
    user.name = "Emre"
    user.email = "eozcan@mail.com"
    user.age = 25

    user.apply {
        name = "John"
        email = "jdoe@mail.com"
        age = 30
    }

    //user.printInfo()

    // also {} yan işlem

    user.apply {
        name = "Android"
        email = "android@mail.com"
        age = 19
    }.also {
        //it.printInfo()
    }

    // run {}
    val result = "Kotlin".run {
        uppercase()
    }

    println(result)

    // with {}
    val stringBuilder = StringBuilder()
    val text = with(stringBuilder) {
        append("Hello, ")
        append("Kotlin!")
        toString()
    }
    println(text)
}

class User {
    var name: String = ""
    var age: Int = 0
    var email: String = ""

    fun printInfo() {
        println("Name: $name, Age: $age, Email: $email")
    }
}
