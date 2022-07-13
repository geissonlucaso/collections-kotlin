package org.example.collections

fun main() {
    val geisson = Employee("Geisson", 2500.0, "CLT")
    val patrick = Employee("Patrick", 2000.0, "PJ")
    val giulia = Employee("Giulia", 2200.0, "CLT")
    val joao = Employee("Joao", 1500.0, "CLT")
    val paula = Employee("Paula", 3000.0, "CLT")

    println("-----------LIST-----------")
    val employees = mutableListOf<Employee>(geisson, giulia)
    employees.forEach { employee ->
        println(employee)
    }

    println("---------Add patrick----------")
    employees.add(patrick)
    employees.forEach { employee ->
        println(employee)
    }

    println("---------Remove geisson----------")
    employees.remove(geisson)
    employees.forEach { employee ->
        println(employee)
    }
    println("-----------SET-----------")
    val employeesSet = mutableSetOf<Employee>(geisson)
    employeesSet.forEach { employee ->
        println(employee)
    }

    println("---------Add paula----------")
    employeesSet.add(paula)
    employeesSet.forEach { employee ->
        println(employee)
    }

}