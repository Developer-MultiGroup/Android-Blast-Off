package com.emreozcan.kotlinmodernprogramming.basics

fun main() {
    //demoVariables()
    //demoPrimitiveTypes()
    //demoIfWhen()
    //demoCollections()
    demoLoops()
}

fun demoVariables() {
    val name = "Android"

    var age = 25
    //age = age + 1
    age += 1

    //println("Name: $name, Age: $age")


    lateinit var description: String

    description = "Powerful modern language"
    println("Description: $description")

}

fun demoPrimitiveTypes() {
    val name: String = "Android"
    val age: Int = 28
    val height: Double = 1.80
    val isActive: Boolean = true

    println("Name: $name")
    println("Age: $age")
    println("Height: $height")
    println("Active: $isActive")

    //Type Convert
    val newAge = age.toString()
}



fun demoIfWhen() {
    val score = 85
    /*
    var grade: String
    if (score >= 90) {
        grade = "A"
    } else if (score >= 80){
        grade = "B"
    } else {
        grade = "C"
    }

     */

    val grade = if (score >= 90) "A" else if (score >= 80) "B" else "C"

    //println("Grade: $grade")

    val role = "admin"
    val accessLevel = when (role) {
        "admin" -> "Full Access"
        "user" -> "Limited Access"
        else -> "No Access"
    }

    println("Access: $accessLevel")
}



fun demoCollections() {
    val numbers = listOf(1, 2, 3, 4, 5)
    //println(numbers)

    val even = numbers.filter { it % 2 == 0 }
    val squared = numbers.map { it * it }

    //println("Even Numbers: $even")
    println("Squared Numbers: $squared")
}

fun demoLoops() {
    val items = listOf("Kotlin", "Compose", "ViewModel")
    /*
    for (item in items) {
        println("Item: $item")
    }

     */
    /*
    items.forEach {
        println("Item: $it")
    }

     */



    items.forEachIndexed { index, item ->
        println("[$index] $item")
    }
}



