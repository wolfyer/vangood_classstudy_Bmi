package com.vangood.lib

class GraduateStudent(name:String, english:Int, math:Int) :Student(name, english, math){
    constructor(name: String): this(name,0,0)
    constructor():this("",0,0)
    //需求寫建構子

}
fun main(){
    var jenny =GraduateStudent("Jenny",90,66)
    //jenny.toString()//沒繼承就有的三種功能
    //屬性跟方法才被繼承，建構子不被繼承
    //jenny.print()
}