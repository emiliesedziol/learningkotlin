package basics

import java.io.IOException

fun main(args: Array<String>) {

    val input = try {
        getExternalInput()
    } catch(e: IOException) {
        e.printStackTrace()
        ""   // returns an empty variable
    } finally {
        println("out of try catch block")
    }
    println(input)
}

fun getExternalInput(): String {
    throw IOException("could not read input")
}