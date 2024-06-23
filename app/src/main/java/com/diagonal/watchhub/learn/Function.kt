package com.diagonal.watchhub.learn

fun main(){

   //fun functionName(par1,par2,...): returnType{}

    val result= add(4,5)
    println(result)

    val result2= addInline(num1=8,num2=5)  //with named arguments
    println(result2)

    evenOrOdd(12)

    evenOrOdd(13)  //arguments


    //function variable
    val fn: (num1: Int, num2: Int) -> Int =::add
    println(fn(10,10))
}

fun add(num1:Int, num2:Int):Int
{
    val sum= num1+num2
    return sum
}

fun  addInline(num1:Int,num2:Int)= num1+num2

fun evenOrOdd(number:Int) {   //parameter
   val result= if(number%2==0)  "even" else  "odd"
    println(result)

}