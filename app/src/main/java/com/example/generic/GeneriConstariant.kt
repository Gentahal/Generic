package com.example.generic
/*Terkadang kita ingin membatasi data yang boleh di gunakan di generic parameter type
kita bisa bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang di perbolehkan
secara otomatis,type data yang bisa di guankan adalah type yang sudah kita sebutkan secara default
constraint type untuk generic parameter typw adalah any sehinggasemua tipe data bisa digunakan
 */

open class Employe

class Manager : Employe()

class VicePresident : Employe()

class Company<T : Employe>(val employe: T)

fun main() {
    val data1 =Company(Manager())
    val data2 =Company(VicePresident())
}