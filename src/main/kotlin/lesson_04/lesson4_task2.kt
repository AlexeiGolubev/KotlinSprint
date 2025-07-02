package org.example.lesson_04

//При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу, которая проверяет, соответствует ли груз категории "Average". Эта категория имеет следующие параметры: вес от 35 кг (не включительно) до 100 кг (включительно), и объем меньше 100 литров (не включительно).
//
//Создай программу, которая отображает соответствие данных груза категории "Average". Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".
//
//- укажи предварительно заданные параметры категории;
//- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
//- сделай сравнение непосредственно внутри println() и без использования диапазонов.

fun main() {
    val minWeightOfCargo = 35
    val maxWeightOfCargo = 100
    val maxVolumeOfCargo = 100

    val weightOfFirstCargo = 20
    val volumeOfFirstCargo = 80

    val weightOfSecondCargo = 50
    val volumeOfSecondCargo = 100

    cargoCategoryCompliance(minWeightOfCargo, maxWeightOfCargo, maxVolumeOfCargo, weightOfFirstCargo, volumeOfFirstCargo)
    cargoCategoryCompliance(minWeightOfCargo, maxWeightOfCargo, maxVolumeOfCargo, weightOfSecondCargo, volumeOfSecondCargo)

}

fun cargoCategoryCompliance(
    minWeightOfCargo: Int,
    maxWeightOfCargo: Int,
    maxVolumeOfCargo: Int,
    weightOfCargo: Int,
    volumeOfCargo: Int,
    ){

    println("Груз с весом $weightOfCargo кг и объемом $volumeOfCargo л соответствует категории 'Average': ${(weightOfCargo > minWeightOfCargo && weightOfCargo <= maxWeightOfCargo) && volumeOfCargo < maxVolumeOfCargo}")

}