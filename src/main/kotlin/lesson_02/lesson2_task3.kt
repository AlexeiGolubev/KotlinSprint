package org.example.lesson_02

const val TIME_CONST = 60
const val DAY_CONST = 24

//Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//
//– Создай целочисленные переменные и проинициализируй их этими данными;
//– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//– Выведи результат в консоль.

fun main() {
    val trainDepartureHour = 9
    val trainDepartureMinute = 39
    val departureTime = trainDepartureHour * TIME_CONST + trainDepartureMinute
    val travelTime = 457

    val totalNumberOfMinutes = departureTime + travelTime
    val totalNumberOfHours = totalNumberOfMinutes / TIME_CONST
    val dayOfTrainArrival = totalNumberOfHours / DAY_CONST
    val hourOfTrainArrival = totalNumberOfHours % DAY_CONST
    val minuteOfTrainArrival = totalNumberOfMinutes % TIME_CONST

    println("Дней в пути: $dayOfTrainArrival")
    println("Время прибытия поезда: %02d:%02d".format(hourOfTrainArrival, minuteOfTrainArrival))

}