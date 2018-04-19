package basics

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val veryLongList = (1..9999990L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = veryLongList
                .filter { it > 50 }
                .take(1000)
                .map { it * 2 }
                .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum =  veryLongList
                .asSequence()
                .filter { it > 50 }
                .take(1000)
                .map { it * 2 }
                .sum()
    }
    println("msNonLazy $msNonLazy       sum $sum")
    println("msLazy $msLazy            lazySum $lazySum")
    /* take after map
       msNonLazy 5759       sum 1101000
       msLazy 35            lazySum 1101000

    take before map
    msNonLazy 345       sum 1101000
    msLazy 16            lazySum 1101000
    */
    var sum2 = 0L
    var lazySum2 = 0L

    val msNonLazy2 = measureTimeMillis {
        sum2 = veryLongList
                .filter { it > 50 }
                .take(1000)
                .map { it * 2 }
                .map { it / 4 }
                .map { it * 5 }
                .map { it / 3 }
                .sum()
    }

    val msLazy2 = measureTimeMillis {
        lazySum2 =  veryLongList
                .asSequence()
                .filter { it > 50 }
                .take(1000)
                .map { it * 2 }
                .map { it / 4 }
                .map { it * 5 }
                .map { it / 3 }
                .sum()
    }
    println("msNonLazy2 $msNonLazy2       sum2 $sum2")
    println("msLazy2 $msLazy2            lazySum2 $lazySum2")
    /*
    msNonLazy2 306       sum2 458000
    msLazy2 3            lazySum2 458000

     */

    var sum3 = 0L
    var lazySum3 = 0L

    val msNonLazy3 = measureTimeMillis {
        sum3 = veryLongList
                .filter { it > 50 }
                .map { it * 2 }
                .map { it / 4 }
                .map { it * 5 }
                .map { it / 3 }
                .take(1000)
                .sum()
    }

    val msLazy3 = measureTimeMillis {
        lazySum3 =  veryLongList
                .asSequence()
                .filter { it > 50 }
                .take(1000)
                .map { it * 2 }
                .map { it / 4 }
                .map { it * 5 }
                .map { it / 3 }
                .sum()
    }
    println("msNonLazy3 $msNonLazy3       sum2 $sum3")
    println("msLazy3 $msLazy3            lazySum2 $lazySum3")

    /*
    msNonLazy 324       sum 1101000
    msLazy 13            lazySum 1101000
    msNonLazy2 457       sum2 458000
    msLazy2 22            lazySum2 458000
    msNonLazy3 11510       sum2 458000
    msLazy3 4
     */
}