package com.sesac.account

import kotlin.math.abs
import kotlin.random.Random

fun main(){
    val account1 = Account(50000f, "김한울",
        abs(Random.nextInt()).toString())

    val account2 = Account(30000f, "이소정",
        abs(Random.nextInt()).toString())

    account1.transferMoney(5000f, account2)
//
//    println(account1.toString())
//    println(account2.toString())

    account1.withdrawMoney(10000f)
    println(account1.toString())

    account2.withdrawMoney(10000f)
    println(account2.toString())


}