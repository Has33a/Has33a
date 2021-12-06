package com.sesac.account

import java.text.NumberFormat
import java.util.*

class Account {
    private var balance = 0.0f
    //생성자가 하는 일 -> 설계된 클래스에서 객체를 초기화할때 설정할 인스턴트 속성

    private var accountName = ""
    private var accountNumber = ""

    //보조 생성자
    constructor() {}
    constructor(balance: Float, accountName: String, accountNumber: String) {
        this.balance = balance
        this.accountName = accountName
        this.accountNumber = accountNumber
    }
    fun withdrawMoney(balance: Float) {
        if (balance > 0.0f && this.balance >= balance) {
            this.balance -= balance
        } else {
            printValidate(balance)
        }
    }
    fun depositMoney(balance: Float) {
        if (balance > 0.0f) {
            this.balance += balance
        } else {
            printValidate(balance)
        }
    }
    private fun printValidate(money: Float) {
        println("""$money 로는 입출금을 할 수 없습니다""")
    }

    fun transferMoney(money: Float, account: Account) {
if(money > 0.0f && balance >= money){

    account.depositMoney(money)
    withdrawMoney(money)
}
    }



    override fun toString(): String {
        return "$accountName 님의 현재 잔고는 ${NumberFormat.getCurrencyInstance(Locale.getDefault()).format(balance)} 입니다"
    }
}
