package basics

fun main(args: Array<String>) {

    val list = (1..100).toList()

    val doubled = list.map { element -> element * 2 }

    //same ad

    list.map { it * 2 }

    println(doubled)

    val average = list.average()
    println("average")
    println(average)

    val shifted = list.map{ it - average}
    println("shifted")
    println(shifted)

    // flatMap()
    val nestedList = listOf(
            (1..10).toList(),
            (1..20).toList(),
            (21..30).toList()
    )

    val notFlattened = nestedList.map { it.sortedDescending() }
    println("nested lists")
    println(notFlattened)

    val flattened = nestedList.flatMap{ it.sortedDescending() }
    println("flattened")
    println(flattened)
}