package com.example.generic

class Function(val nama : String) {

    fun <T> sayHello(param : T){
        println("Hello $param, My name is $nama")
    }
}

fun main() {
    val function = Function("Genta")

    function.sayHello("Anak baik")
}