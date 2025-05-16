package com.emreozcan.kotlinmodernprogramming.oop.enumAndSealed

enum class DayOfWeek {
    MONDAY, //0 -> ordinal
    TUESDAY, //1
    WEDNESDAY, //2
    THURSDAY, //3
    FRIDAY, //4
    SATURDAY, //5
    SUNDAY //6
}

enum class UserRole(val description: String) {
    ADMIN("Full access"),
    USER("Standard access"),
    GUEST("Read-only")
}
