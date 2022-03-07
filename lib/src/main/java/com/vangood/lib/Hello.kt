package com.vangood.lib

fun main(args: Array<String>) {
    //println("Hello World!")
    //Person().hello()
    val p = Person()//住址
    p.hello()
    //variable可改變 var
    val age = 18
    println(age)
    val weight = 64.5f//float 不然就是double
    val height = 1.7f
    val bmi = weight/(height*height)
    println(bmi)
    val isAdult = true
    //
    var name:String? = null
    name = "Hank"
    //name.toUpperCase()
    name?.uppercase()//不是ＮＵＬＬ才執行？
}