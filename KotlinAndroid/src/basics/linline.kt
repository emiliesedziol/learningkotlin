package basics

fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main(args: Array<String>) {

    modifyString("Kotlin is here", { it.toUpperCase() })
}