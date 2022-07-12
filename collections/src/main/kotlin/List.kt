package org.example.collections

fun main() {
    val geisson = Employee("Geisson", 2500.0, "CLT")
    val patrick = Employee("Patrick", 2000.0, "PJ")
    val giulia = Employee("Giulia", 2200.0, "CLT")

    val listEmployee = listOf<Employee>(geisson, patrick, giulia)

    listEmployee.forEach { println(it) }
    println("---------------------------")
    println(listEmployee.find { it.name == "Geisson" })
    println("---------------------------")
    val salaryLessThan2400 = listEmployee.filter { it.salary in 0.0..2400.0 }
    salaryLessThan2400.forEach { employee ->
        println(employee)
    }
    println("---------------------------")
    val employee = listEmployee.filter { it.name == "Giulia" }
    println(employee)
    println("---------------------------")
    listEmployee
        .sortedBy { it.salary }
        .forEach { println(it) }
    println("---------------------------")
    listEmployee
        .groupBy { it.type }
        .forEach { println(it) }
    println("---------------------------")

}
