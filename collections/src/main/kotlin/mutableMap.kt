package org.example.collections

fun main() {
    val geisson = Employee("Geisson", 2500.0, "CLT")
    val patrick = Employee("Patrick", 2000.0, "PJ")
    val giulia = Employee("Giulia", 2200.0, "CLT")
    val joao = Employee("Joao", 1500.0, "CLT")
    val paula = Employee("Paula", 3000.0, "CLT")

    val repo = Repository<Employee>()

    repo.create("Geisson", geisson)
    repo.create("Patrick", patrick)
    repo.create("Paula", paula)

    println(repo.findById(giulia.name))
    println(repo.findById(geisson.name))

    println("-----------Show all emplyees-----------")
    val employees = repo.getAll()
    employees.forEach { println(it) }

}