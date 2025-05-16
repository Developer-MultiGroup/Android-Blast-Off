package com.emreozcan.kotlinmodernprogramming.oop.polymorphism

open class Animal() {
    open fun speak(): String {
        return "Animal makes a sound"
    }
}

class Dog() : Animal() {
    override fun speak(): String {
        return "Dog barks"
    }
}

class Cat() : Animal() {
    override fun speak(): String {
        return "Cat meows"
    }
}
