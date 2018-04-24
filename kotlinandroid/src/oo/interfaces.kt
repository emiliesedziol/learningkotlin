package oo

interface Drivable {
    fun drive() {
        println("Driving interface")
    }
}

class Bicycle : Drivable {
    override fun drive() {
        println(message = "Driving bicycle")
    }
}

class Boat : Drivable {
    override fun drive() {
        println("Driving boat")
    }

}

fun main(args: Array<String>) {

    val drivable: Drivable = Bicycle()
    drivable.drive()
}