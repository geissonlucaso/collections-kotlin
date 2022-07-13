package org.example.collections

fun main() {
    val values = arrayOf(
        "2000.0".toBigDecimal(),
        "1500.0".toBigDecimal(),
        "3000.0".toBigDecimal()
    )

    println(values.sumTotal())
    println(values.average())
}