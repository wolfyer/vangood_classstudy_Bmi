package com.vangood.lib

class GraduateStudent(name:String, english:Int, math:Int) :Student(name, english, math){
}
fun main(){
    var jenny =GraduateStudent("Jenny",90,66)
    jenny.toString()//沒繼承就有的三種功能
    //屬性跟方法才被繼承，建構子不被繼承ex:GraduteStudent("Jenny")
    jenny.print()
}