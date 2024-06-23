package com.diagonal.watchhub.learn

//https://www.youtube.com/watch?v=1maBb3B2LRo&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=14
fun main(args:Array<String>)
{
   //Object that stores multiple values of same type
    // Fixed Size

    var arr: Array<String> = arrayOf("one","two","three")


    for ((i,e) in arr.withIndex())
    {
        println("$i - $e")
    }
    println(arr[0])
    println(arr.get(1))
    arr.set(0,"Hello")
    println(arr.size)
}