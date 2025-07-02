package org.example.lesson_03

//В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода]. Игрок начал партию ходом из E2 в E4. Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.
//
//– Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль. Нужно "собрать" единую строку из объявленных переменных и сохранить в новую переменную (или сразу распечатывать).
//
//– Далее этим переменным нужно присвоить новые данные и вывести в консоль следующий ход белых. Определить, какое значение будет в переменной "куда" для фигуры, стоящей на D2 и продвинувшейся на одну клетку вперед.

fun main() {
    val squareNumbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val squareLetters = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
    var numberOfMoves = 1

    var stringOfMoves = "[%S%d-%S%d;%d]".format(squareLetters[4], squareNumbers[1], squareLetters[4], squareNumbers[3], numberOfMoves)
    println(stringOfMoves)
    numberOfMoves++

    stringOfMoves = "[%S%d-%S%d;%d]".format(squareLetters[3], squareNumbers[1], squareLetters[3], squareNumbers[2], numberOfMoves)
    println(stringOfMoves)
    numberOfMoves++

}