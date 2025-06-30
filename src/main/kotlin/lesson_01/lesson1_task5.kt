package org.example.lesson_01

const val TIME_CONST = 60

//    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//    - Значения часов, минут и секунд отображать двумя цифрами.

fun main() {
    val numberOfSecondsOfGagarinSpaceFlight: Short = 6480
    val numberOfHours = numberOfSecondsOfGagarinSpaceFlight / (TIME_CONST*TIME_CONST)
    val numberOfMinutes = numberOfSecondsOfGagarinSpaceFlight % (TIME_CONST*TIME_CONST) / TIME_CONST
    val numberOfSeconds = numberOfSecondsOfGagarinSpaceFlight % (TIME_CONST*TIME_CONST) % TIME_CONST

    print("Время, проведённое Гагарином в космосе: ")
    println("${String.format("%02d",numberOfHours)}:" +
            "${String.format("%02d",numberOfMinutes)}:" +
            "${String.format("%02d",numberOfSeconds)}")

}