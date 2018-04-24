package oo

//  extension functions
fun Int.isEven() = (this % 2 == 0)  // explicit boolean
fun Int.isOdd() = (this % 2 != 0)

//  extension function of City
fun City.isLarge() = population > 1000000

fun main(args: Array<String>) {

    println(5.isEven())  // false

    val naturals = listOf(2, 5, 11, 3, 8, 33)
    println(naturals.filter { it.isEven() })  // [2, 8]
    println(naturals.filter { it.isOdd() })   //[5, 11, 3, 33]

    val austin = City()
    austin.name = "Austin"
    austin.population = 950000
    println(austin.isLarge())  //false

    val houston = City()
    houston.name = "Houston"
    houston.population = 2000000
    println(houston.isLarge())   //true
}

/*
false
[2, 8]
[5, 11, 3, 33]
false
true
 */