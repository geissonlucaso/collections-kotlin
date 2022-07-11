package org.example.collections

fun main(){
    val nomes = Array<String>(3) {""}
    nomes[0] = "Geisson"
    nomes[1] = "Giulia"
    nomes[2] = "Gislaine"

    for(nome in nomes){
        println(nome)
    }

    println("---------------------")
    nomes.sort()
    nomes.forEach { nome ->
        println(nome)
    }

    println("---------------------")
    nomes.forEach { println(it) }
}