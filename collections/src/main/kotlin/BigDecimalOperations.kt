package org.example.collections

import java.math.BigDecimal

fun Array<BigDecimal>.sumTotal() = this.reduce{
    acc, value -> acc + value
}

fun Array<BigDecimal>.average() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.sumTotal() / this.size.toBigDecimal()