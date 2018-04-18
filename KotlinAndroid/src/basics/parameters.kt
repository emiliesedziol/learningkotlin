package basics

fun main(args: Array<String>) {

    val together = concat(listOf("Kotlin", "Java", "Pick"), " : ")
    println(together)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)