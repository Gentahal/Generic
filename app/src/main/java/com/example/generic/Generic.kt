package com.example.generic

class Building2<T ,U>(val data : T,val secondData : U){
    fun printData(){
        return println("Data is $data $secondData")
    }
}

fun main() {


    val dataString = Building2<String,Int>("Pertamina",10)

    val dataInt = Building2<Int,String>(10, "PLN")

    val dataBoolean = Building2(false,10)

    dataString.printData()
    dataInt.printData()
    dataBoolean.printData()
}