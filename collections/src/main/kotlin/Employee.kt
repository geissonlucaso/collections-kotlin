package org.example.collections

data class Employee(
    val name:String,
    val salary:Double,
    val type: String
) {
    override fun toString(): String = "$name - $salary".trimIndent()
}