package com.emreozcan.kotlinmodernprogramming.oop.enumAndSealed

fun main() {
    //println("Saturday working day: ${isWorkingDay(DayOfWeek.SATURDAY)}")
    //println("Wednesday working day: ${isWorkingDay(DayOfWeek.WEDNESDAY)}")

    println("Can delete USER: ${canDeleteUser(UserRole.USER)}")
    println("Can delete ADMIN: ${canDeleteUser(UserRole.ADMIN)}")

    println(UserRole.entries)
    println(UserRole.ADMIN.name)
    println(UserRole.ADMIN.description)
    println(UserRole.ADMIN.ordinal)
}

fun isWorkingDay(day: DayOfWeek): Boolean {
    return when (day) {
        DayOfWeek.SATURDAY, DayOfWeek.SUNDAY -> false
        else -> true
    }
}

fun canDeleteUser(role: UserRole): Boolean {
    return role == UserRole.ADMIN
}

