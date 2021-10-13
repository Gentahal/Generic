package com.example.generic
//secara default, saat kita membuat generic parameter type,
//sifat parameter tersebut adalah invariant
//invariant = tidak boleh subtitusi  subtype(child) atau supertype(parent)*/

class Invariant <T> (val data : T)

fun main() {
   val data1 : Invariant<String> =Invariant("Genta")
   val data2 : Invariant<Any> =Invariant("Anak baik")
}
