package com.diagonal.watchhub.learn

fun main(args: Array<String>)
{

    println("with range")
    for(i in 1..5)
    {
        println(i)
    }
    println("with step")
    for(i in 1..5 step 2)
    {
        println(i)
    }

    println("with until")
    for(i in 1 until 5)
    {
        println(i)
    }

    println("with decrement")
    for(i in 10 downTo 5)
    {
        println(i)
    }

    println("with String templating")

    var number=2
    for (i in 1..10)
    {
        println("$number x $i = ${number * i}")
    }

}