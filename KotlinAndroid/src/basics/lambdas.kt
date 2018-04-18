package basics

fun main(args: Array<String>) {

    val timesTwo = { x: Int -> x*2 }
    val add: (Int, Int) -> Int = { x: Int, y:Int -> x + y }

    val list = (1..100).toList()

    println("Java")
    println(list.filter({ element -> element % 2 == 0}))


    println("Kotlin ")
    println(list.toString())
    println(list.filter({ it % 2 == 0}))

    println("Kotlin using a function")
    println(list.toString())
    println(list.filter({ it.even() }))
    println(list.filter{ it.even() })  // can also be coded as this

    println("is even")
    println(list.toString())
    println(list.filter(::isEven))

    println("is odd")
    println(list.filter(::isOdd))

}

fun isEven(i: Int) = i % 2 == 0

fun isOdd(i: Int) = i % 2 != 0

fun Int.even() = this % 2 == 0