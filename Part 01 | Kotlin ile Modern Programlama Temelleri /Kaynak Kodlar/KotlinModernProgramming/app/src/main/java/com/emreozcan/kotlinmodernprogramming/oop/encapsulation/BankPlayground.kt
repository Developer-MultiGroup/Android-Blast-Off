package com.emreozcan.kotlinmodernprogramming.oop.encapsulation

fun main() {
    val account = BankAccount(2000, "Emre Özcan")

    account.deposit(500)
    println(account.getBalance())

    account.withdraw(1000)
    println(account.getBalance())
}