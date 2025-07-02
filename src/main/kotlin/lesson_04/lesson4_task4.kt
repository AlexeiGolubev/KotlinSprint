package org.example.lesson_04

//Программа тренировок разбивает упражнения на две группы: упражнения для мышц рук/пресса и ног/спины. Она рекомендует делать упражнения на каждую группу мышц через день. Пользователь начал занятия с рук и пресса. Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.
//
//Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса. Выведи сообщение в виде нескольких красивых ровных строк.
//
//Вывод должен быть таким:
//
//Упражнения для рук:       true
//Упражнения для ног:       false
//Упражнения для спины:  false
//Упражнения для пресса: true
//
//- все сообщение должно печататься в одном println();
//- при изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.

fun main() {
    val handsExercises = true
    val legsExercises = false
    val backExercises = false
    val pressExercises = true
    var numberOfTrainingDay = 1

    println(trainingDay(numberOfTrainingDay, handsExercises, legsExercises, backExercises, pressExercises))

    numberOfTrainingDay = 5
    println()
    println(trainingDay(numberOfTrainingDay, handsExercises, legsExercises, backExercises, pressExercises))

}

fun trainingDay(
    numberOfTrainingDay: Int,
    handsExercises: Boolean,
    legsExercises: Boolean,
    backExercises: Boolean,
    pressExercises: Boolean,
): String {
    if (numberOfTrainingDay % 2 == 0) {
        return """
            День тренировок:        $numberOfTrainingDay
            Упражнения для рук:     ${!handsExercises}
            Упражнения для ног:     ${!legsExercises}
            Упражнения для спины:   ${!backExercises}
            Упражнения для пресса:  ${!pressExercises}
        """.trimIndent()
    }
    else {
        return """
            День тренировок:        $numberOfTrainingDay
            Упражнения для рук:     $handsExercises
            Упражнения для ног:     $legsExercises
            Упражнения для спины:   $backExercises
            Упражнения для пресса:  $pressExercises
        """.trimIndent()
    }

}