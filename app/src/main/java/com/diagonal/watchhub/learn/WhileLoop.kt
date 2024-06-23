package com.diagonal.watchhub.learn

fun main()
{
   // tryWhileLoop()

    tryDoWhileLoop()


}

fun tryWhileLoop()  //Run until a condition is true
{
    var count=2
    var index=1
    while (index<=10)
    {
        println(count*index)
        index++
    }

}
fun tryDoWhileLoop() // Run first then check for condition
{

    var index=5
    do{
        println(index)
        index++
    }while(index<10)

}