package org.example.collections

fun main() {

    val geisson = Employee("Geisson", 2500.0, "CLT")
    val patrick = Employee("Patrick", 2000.0, "PJ")
    val giulia = Employee("Giulia", 2200.0, "CLT")

    val employees1 = setOf<Employee>(geisson, patrick)
    val employees2 = setOf<Employee>(giulia)

    val setUnion = employees1.union(employees2)
    setUnion.forEach{ println(it) }
    println("---------------------------")

    val employees3 = setOf<Employee>(geisson, patrick, giulia)
    val setSubtract = employees3.subtract(employees1)
    setSubtract.forEach { println(it) }
    println("---------------------------")

    val setIntersect = employees3.intersect(employees1)
    setIntersect.forEach { println(it) }


}