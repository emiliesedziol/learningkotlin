package basics

fun main(args: Array<String>) {

    val inputRows = listOf(
            mapOf("input1.csv" to listOf(3, 5, -12, 9, 22)),
            mapOf("input2.csv" to listOf()),
            mapOf("input3.csv" to listOf(222, 43, 55))
    )

    val cleanup = inputRows.flatMap{ it.values }
            .flatten()
            .filter { it in 0..100 }
            .toIntArray()

    println(cleanup.joinToString())
    // 3, 5, 9, 22, 43, 55
}