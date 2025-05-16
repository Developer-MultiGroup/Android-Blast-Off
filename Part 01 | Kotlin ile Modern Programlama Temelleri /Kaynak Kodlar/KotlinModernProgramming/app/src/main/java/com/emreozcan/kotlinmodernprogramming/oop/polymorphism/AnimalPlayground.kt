package com.emreozcan.kotlinmodernprogramming.oop.polymorphism

fun main() {
    val animal = Animal()
    println(animal.speak())

    val dog = Dog()
    println(dog.speak())

    val cat = Cat()
    println(cat.speak())
}