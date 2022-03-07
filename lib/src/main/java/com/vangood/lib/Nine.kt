package com.vangood.lib

fun main() {
    for ( i in 2..9){
            println("\n")
        for ( j in 1..9){

            print("$i * $j =${if(i*j < 10)" " else ""} ${i*j}  ")

        }
    }
}
class Nine {
}