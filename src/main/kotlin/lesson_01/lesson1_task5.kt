package org.example.lesson_01

//    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//    - Значения часов, минут и секунд отображать двумя цифрами.

fun main() {
    val numberOfSecondsOfGagarinSpaceFlight: Short = 6480
    val numberOfHours = numberOfSecondsOfGagarinSpaceFlight / 3600
    val numberOfMinutes = numberOfSecondsOfGagarinSpaceFlight % 3600 / 60
    val numberOfSeconds = numberOfSecondsOfGagarinSpaceFlight % 3600 % 60

    print("Время, проведённое Гагарином в космосе: ")
    println("${String.format("%02d",numberOfHours)}:" +
            "${String.format("%02d",numberOfMinutes)}:" +
            "${String.format("%02d",numberOfSeconds)}")

}