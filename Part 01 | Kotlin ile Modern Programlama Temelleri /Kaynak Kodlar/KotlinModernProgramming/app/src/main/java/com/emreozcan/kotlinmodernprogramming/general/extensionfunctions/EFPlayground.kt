package com.emreozcan.kotlinmodernprogramming.general.extensionfunctions

import android.content.Context
import android.widget.Toast

fun main() {
    val topic = "Kotlin"
    val topicWithHashtag = "#$topic"

    println(topicWithHashtag)

    val group = "Developer MultiGroup"
    //println(group.addHashtag())

    val firstNumber = 5
    val secondNumber = 8

    println("Is $firstNumber even number: ${firstNumber.isEvenNumber()}")
    println("Is $secondNumber even number: ${secondNumber.isEvenNumber()}")
}

fun String.addHashtag() : String {
    return "#$this"
}

fun Int.isEvenNumber() : Boolean {
    return this % 2 == 0
}

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}