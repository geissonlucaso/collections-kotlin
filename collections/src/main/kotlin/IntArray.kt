package org.example.collections

fun main(){
    val values = IntArray(5)

    values[0] = 5
    values[1] = 3
    values[2] = 1
    values[3] = 2
    values[4] = 4

    for(number in values){
        println(number)
    }

    println("---------------------")
    values.forEach {number ->
        println(number)
    }

    println("---------------------")
    for(index in values.indices){
        println(values[index])
    }

    println("---------------------")
    values.sort()
    for(number in values){
        println(number)
    }
}