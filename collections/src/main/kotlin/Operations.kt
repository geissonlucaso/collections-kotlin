package org.example.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2500.0, 850.0, 3000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("----------------------")
    println("Maior: ")
    println(salarios.maxOrNull())
    println("----------------------")
    println("Menor: ")
    println(salarios.minOrNull())
    println("----------------------")
    println("Média: ")
    println(salarios.average())
    println("----------------------")
    val salarioMaiorQue2000 = salarios.filter { it > 2000.0 }
    salarioMaiorQue2000.forEach { println("Salários maior que 2000: $it") }
    println("----------------------")
    println(salarios.count { it in 1500.0..5000.0 })
    println("----------------------")
    println(salarios.find { it == 3000.0 })
    println("----------------------")
    println(salarios.any { it == 1000.0 })
}