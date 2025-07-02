package org.example.lesson_02

const val PERCENTAGE_VALUE = 100

//В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса), который дает +20% к добытым материалам. Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные, объявить и проинициализировать.
//
//Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных” (то есть тех материалов, которые даются “сверху” баффом). По одной строке на материал с его названием.
//
//Если получается нецелое число, то дробная часть должна отбрасываться.

fun main() {
    val numberOfCrystalOre = 7
    val numberOfIronOre = 11
    val buffSize = 20
    val numberOfCrystalOreWithBuff = numberOfCrystalOre * buffSize / PERCENTAGE_VALUE
    val numberOfIronOreWithBuff = numberOfIronOre * buffSize / PERCENTAGE_VALUE

    println("Было добыто $numberOfCrystalOre кристаллической и $numberOfIronOre железной руды без баффа.")
    println("Бафф (временное усиление какого-либо юнита или процесса), который дает +$buffSize% к добытым материалам.")
    println("Количество “бонусной” кристаллической руды: $numberOfCrystalOreWithBuff")
    println("Количество “бонусной” железной руды: $numberOfIronOreWithBuff")

}