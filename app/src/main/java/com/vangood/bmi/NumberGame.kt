package com.vangood.bmi

class NumberGame {
    var secret = (1..10).random()
    var counter = 0
    var end = false
    fun resetgame(){
        secret = (1..10).random()
        counter = 0
        end = false
    }
    fun guess(num:Int):String{
        counter++
        val message = if (num > secret) "Smaller"
        else if (num < secret) "Bigger"
        else {
            end = true
            "you got it"
        }
        return message
    }
}