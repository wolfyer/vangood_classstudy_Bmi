package com.vangood.lib

class Boxes (var name:String,
             var length:Int,
             var width:Int,
             var height:Int){
    fun print(){
        println("$name\t$length\t$width\t$height")
    }
    fun choose(){
        if (length<11 && width<11 && height<11){ println("Box1 $50")}
        else if (length<11 && width<11 && height<16){ println("Box2 $60")}
        else if (length<11 && width<16 && height<16){ println("Box3 $70")}
        else{ println("No Box")}
    }

}

fun main() {
    val jane=Boxes("Jane",10,10,8)
    jane.print()
    jane.choose()
}