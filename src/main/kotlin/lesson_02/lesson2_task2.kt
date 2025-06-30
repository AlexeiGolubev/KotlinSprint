package org.example.lesson_02

//В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.

fun main() {
    val numberOfStaffer = 50
    val numberOfInterns = 30
    val salaryOfStaffer = 30000
    val salaryOfInterns = 20000

    val costsForSalariesToStaffers = numberOfStaffer * salaryOfStaffer
    val costsForSalariesToInterns = numberOfInterns * salaryOfInterns
    val totalCostsForSalariesToEmployee = costsForSalariesToStaffers + costsForSalariesToInterns
    val averageSalaryPerEmployee = (totalCostsForSalariesToEmployee) / (numberOfStaffer + numberOfInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $costsForSalariesToStaffers рублей")
    println("Общие расходы по ЗП после прихода стажеров: $totalCostsForSalariesToEmployee рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryPerEmployee рублей")

}