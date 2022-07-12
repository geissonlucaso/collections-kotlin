package org.example.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 10000.0
    salarios[1] = 2000.0
    salarios[2] = 1000.0

    salarios.forEach { println(it) }

    println("-----------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-----------------------")
    salarios.sort()
    for (salario in salarios) {
        println(salario)
    }
}