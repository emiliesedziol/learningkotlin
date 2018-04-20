package basics

import java.io.FileReader

fun main(args: Array<String>) {

    FileReader("C:\\github\\learningkotlin\\KotlinAndroid\\src\\basics\\test.txt").use {
        // because this is part of the 'use' the file will be closed - Kotlin
        val str = it.readText()
        println(str)
        /* this did work
        Kotlin read
        line2
        line 3
         */
    }

}