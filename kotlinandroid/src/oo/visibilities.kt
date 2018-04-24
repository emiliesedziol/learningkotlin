package oo

// private - can only be used in the class or sub class
// protected - only available in the class or in a sub class:but not to the class
// internal - visible inside the same module
//      set of Kotlin files complied together
// public default

class Car(val brand: String, private val model: String) {

    fun tellMeYourModel() = model
    // adding protected before 'fun tell' the car.tellMeYourModel in the main method would not work anymore
}

fun main(args: Array<String>) {
    val car = Car("BRAND", "MODEL")
    car.brand
    car.tellMeYourModel()

}