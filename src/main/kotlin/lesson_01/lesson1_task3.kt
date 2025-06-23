package org.example.lesson_01

fun main() {
    val yearOfYuriGagarinSpaceFlight: Int = 1961

    var hourOfYuriGagarinSpaceFlight: Int = 9

    var minuteOfYuriGagarinSpaceFlight: Int = 7

    println("Время взлёта Юрия Гагарина в космос")
    println("год: $yearOfYuriGagarinSpaceFlight")
    println("час: ${String.format("%02d",hourOfYuriGagarinSpaceFlight)}")
    println("минута: ${String.format("%02d",minuteOfYuriGagarinSpaceFlight)}")

    hourOfYuriGagarinSpaceFlight = 10
    minuteOfYuriGagarinSpaceFlight = 55

    println("Время приземления Юрия Гагарина из космоса")
    println("${String.format("%02d",hourOfYuriGagarinSpaceFlight)}:" +
            "${String.format("%02d",minuteOfYuriGagarinSpaceFlight)}")

}