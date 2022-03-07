package com.vangood.lib

import kotlin.random.Random

fun main() {
    var min = 1
    var max = 100
    val secret = Random.nextInt(100)+1
    var num = 0
    var count = 1
    var count2 =0
    println(secret)

    while (num != secret && count2 <= 2){
        println("Please select a number between $min and $max :")
        readLine()?.let {
            num = it.toInt()

                while (min < num && num < max){
                    if (num < secret){
                        min=num
                        println("Bigger than $num")
                        count=count+1
                    } else if (num > secret){
                        max=num
                        println("Smaller than $num")
                        count=count+1
                    } else{
                        println("You use $count time to win the game! the final number is $num")
                        break;
                    }

                }
                while (num < min || num > max){
                    count2 = count2+1
                    count=count+1
                    when(count2){
                        1 -> {println("Are you kidding me?")
                            break;}
                        2 -> {println("Pig!")
                            break;}
                        else -> {
                            println("You have no chance")
                            break;
                        }
                    }

                }
            }


        }
    println("End of the game!")




}
class Guess1To100 {
}