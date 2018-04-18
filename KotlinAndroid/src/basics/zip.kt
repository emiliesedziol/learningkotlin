package basics

fun main(args: Array<String>) {

    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    // pair of string to boolean
    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapping = list.zip(list.map { it.contains("t")})

    println(zipped)
    println(mapping)
}