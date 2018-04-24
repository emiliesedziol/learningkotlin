package oo

// for base to be a parent class to be used in a child class it must start with open
open class Base

class Child : Base()
//

open class Shape2(val name: String) {

    open fun area() = 0.0
}

class Circle2(name: String, val radius: Double) : Shape2(name) {
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {

    val smallCircle = Circle2("Small Circle", 2.0)

    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())
}
/*
Small Circle
2.0
12.566370614359172
 */