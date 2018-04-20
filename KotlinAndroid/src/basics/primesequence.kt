package basics

fun main(args: Array<String>) {

    val possiblePrimeAfter2 = generateSequence(3) { it + 2 }

    val primes = generateSequence(2 to possiblePrimeAfter2) {

        // next prime number
        val p = it.second.first()

        val possiblePrimesAfterP = it.second.filter { it % p != 0 }

        p to possiblePrimesAfterP
    }.map { it.first }

    println(primes.take(10).toList())
    // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

}