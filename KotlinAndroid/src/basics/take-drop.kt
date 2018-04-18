package basics

fun main(args: Array<String>) {

    val list = (1..1000).toList()

    val first10 = list.take(10)
    val withoutfirst900 = list.drop(900)
    println("first10")
    println(first10)
    println("withoutfirst900")
    println(withoutfirst900)

    println("")
    val list1 = generateSequence(0) { it + 10 }
    val first = list1.take(10).toList()
    val first20 = list1.take(20).toList()
    println("first10")
    println(first)
    println("first20")
    println(first20)

    println("")
    val list2 = generateSequence(0) {
        println("Calculating ${it+10}")
        it + 10
    }
    val firstb = list2.take(10).toList()
    val firstb20 = list2.take(20).toList()
    println("firstb")
    println(firstb)
    println("firstb20")
    println(firstb20)
}