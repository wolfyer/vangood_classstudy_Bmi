package com.vangood.lib

open class Student (var name:String,var english:Int,var math:Int){
    constructor() : this("",0,0){
        println("Hi!!")
    }
    constructor(name:String) : this(name,0,0){
        println("次要建構子寫法")
    }
    //Methods
    fun print(){
        println("$name\t$english\t$math\t${average()}")
    }
 /*   fun average() : Int {
        return (english+math)/2

    }*/
    fun average() = (english+math)/2
    fun max(a:Int,b:Int) = if (a>b) a else b
    //a method named 'highest' can return one highest score of all courses
    fun highest() = if (english>=math) english else math

/*    fun grading():Char{
         var grade = when(average()/10){
            //10 -> 'A'
            //9 ->'A'
            in 9..10 ->'A'
            8 ->'B'
            7->'C'
            else ->'D'
        }
        return grade

    }*/
    fun  grading() = when(average()/10){
        in 9..10 ->'A'
        8 ->'B'
        7->'C'
        else ->'F'
    }
}

fun main() {
    val hank = Student("Hank")
    val jack = Student("Jack",85,65)

    //println("${jack.name}\t${jack.english}\t${jack.math}")
    jack.print()
    hank.print()
}