package basics

fun main(args: Array<String>) {

    val veryLongList = (1..9999990L).toList()

    val seq = generateSequence (1, { it + 1})
    // cannot print seq because of memory cannot handle an infinite number
    println(seq.take(10).toList())
    // lazy sequence will only look if it is > 50 up to 1000
    val sum = veryLongList
            .asSequence()
            .filter{ it > 50 }
            .map{ it * 2 }
            .take( 1000 )
            .sum()

    println("Sum - 'take' can be moved 1 line up but not 2 $sum")
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    val sum2 = veryLongList
            .filter{ it > 50 }
            .take( 1000 )
            .map{ it * 2 }
            .sum()

    println("sum2 $sum2")

    val sum3 = veryLongList
            .take( 1000 )
            .filter{ it > 50 }
            .map{ it * 2 }
            .sum()
    println("sum3 $sum3")
    /*
    Sum - take can be moved 1 line up but not 2 1101000
sum2 1101000
sum3 998450
     */
}