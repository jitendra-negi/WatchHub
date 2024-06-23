package com.diagonal.watchhub.learn

fun main()
{
    val tile:Tile= Red("light red",10)
    val tile3= Red("Fire",30)
    val tile2= Blue(20)

    println("${tile2.points} and ${tile3.points} ")

    val points= when(tile){
        is Blue -> tile.points*2
        is Red -> tile.points*3
    }
    println(points)
}

sealed class Tile

class Red(val type:String,val points:Int):Tile()
class Blue(val points:Int):Tile()