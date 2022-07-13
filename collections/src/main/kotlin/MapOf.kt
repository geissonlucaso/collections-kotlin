package org.example.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Geisson", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Key: $k\tValue: $v") }
    println("-------------------")
    val map2 = mapOf(
        "Maria" to 3000.0,
        "Pedro" to 2500.0
    )
    map2.forEach { (k, v) -> println("Key: $k\tValue: $v") }
}