package com.diagonal.watchhub.learn


//https://www.youtube.com/watch?v=SZKZlU2kjNs&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=15
fun main()
{

    val skoda= Car("Kushaq","Petrol",30000)
    val hyndai= Car("Create","Diesel",10000)

    println(skoda.name)
    println(skoda.type)
    skoda.driveCar()
    hyndai.applyBreak()
}

class Car (val name:String, val type:String, var kmRun:Int) //properties
{
    fun driveCar() //methods
    {
        println("Car Driving- $name")
    }

    fun applyBreak()
    {
        println("Apply break - $name")
    }
}