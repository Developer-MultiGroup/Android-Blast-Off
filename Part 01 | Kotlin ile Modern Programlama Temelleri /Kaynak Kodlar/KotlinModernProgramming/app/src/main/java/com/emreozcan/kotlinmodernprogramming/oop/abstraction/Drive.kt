package com.emreozcan.kotlinmodernprogramming.oop.abstraction

interface Drivable {
    fun drive()
}

class Bus : Drivable {
    override fun drive() {
        println("Bus is driving")
    }

}

class Car : Drivable {
    override fun drive() {
        println("Car is driving")
    }
}

class Bike : Drivable {
    override fun drive() {
        println("Bike is pedaling")
    }
}



