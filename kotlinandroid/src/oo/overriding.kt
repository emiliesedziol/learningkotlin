package oo

abstract class Vehicle(open val brand: String = "") {
    open fun drive() {
        println("Driving")
    }
    abstract fun honk()
}

class Sedan(override val brand: String = "BRAND") : Vehicle(), Drivable {
    override fun honk() {
         println("haaugga")
    }

    override fun drive() {
        super<Drivable>.drive()
    }

}

fun main(args: Array<String>) {

    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}