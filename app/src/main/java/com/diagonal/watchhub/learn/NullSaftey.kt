package com.diagonal.watchhub.learn

fun main()
{
    var gender:String="male"
    var gender2:String?=null   //now it can accept null as a value
    var isAdult:Boolean?=true

    if(gender2!=null)
    {
        println(gender2)
    }

    println(gender2?.toUpperCase())

    gender2?.let {
        println("Line 1")
        println("line 2 ${gender2?.toUpperCase()}")
        println("line 3 $it")
    }

    var selected:String=gender2 ?:"NA"
    println(selected)

    var new:String?=gender2?.toUpperCase()    //run on any case
}