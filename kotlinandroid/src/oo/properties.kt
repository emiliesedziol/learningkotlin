package oo

class City {
    var name: String = ""
        get() = field   // Java way of doing this
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }

    var population: Int = 0
}

fun main(args: Array<String>) {

    val berlin = City()
    berlin.name = "Berlin"   // call to a setter
    berlin.name = " "   // city is not updated because the setter checks to see 'isNotBlanck
    berlin.population = 3500000

    println(berlin.name)   // call to a getter
    println(berlin.population)

}