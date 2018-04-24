package oo

fun Bicycle.replaceWheel() {
    println("Replace wheel")
}

fun Boat.startEngin(): Boolean {
    println("Starting engin")
    return true
}

fun main(args: Array<String>) {

    val vehicle: Drivable = Bicycle()

    vehicle.drive()

    // (Java)instance <-> (Kotlin)is
    if (vehicle is Bicycle) {

        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngin()
    }

    if (vehicle is Boat && vehicle.startEngin()) {

    }

    if (vehicle !is Boat || vehicle.startEngin()) {

    }

    if (vehicle !is Bicycle) {
        return  // this has to be in place or the next line will not allow 'replaceWheel'
    }

    vehicle.replaceWheel()

}