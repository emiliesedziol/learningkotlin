package oo

open class Being
open class Person : Being()
class Student : Person()

fun main(args: Array<String>) {

    // Covariance = we can use a more derived type (a subtype)
    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student())  // covariance

    val p: Person = Student()  // covariance

    // read only collections are covariant
    val students: List<Person> = listOf<Student>()
    // val students2: MutableList<Person> = mutableListOf<Student>()
    // students2.add(Person())

    // Kotlin TimeSeries
    val events: TimeSeries<Person> = timeSeriesOf()
    val students3: List<Student> = listOf(Student(), Student())
    events.addAll(students3)

    //  Java TimeSeries
    val chartData:JavaTimeSeries<Person> = JavaTimeSeries()
    chartData.add(Student())
    chartData.addAll(students3)
}