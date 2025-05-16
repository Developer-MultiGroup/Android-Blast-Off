package com.emreozcan.kotlinmodernprogramming.oop.encapsulation

class BankAccount (
    private var balance: Int, //Bakiye
    private val _owner: String
) {
    val owner: String
        get() = _owner.uppercase()

    //Para Yatırma
    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
            println("$amount TL hesabınıza yatırılmıştır.")
        } else {
            println("Negatif değer hesaba yatırılamaz!")
        }
    }

    //Para Çekme
    fun withdraw(amount: Int) {
        if (amount > balance) {
            println("Hesabınızda yeterli bakiye yoktur!")
        } else {
            balance -= amount
            println("$amount TL çekilmiştir.")
        }
    }

    fun getBalance() = balance
}