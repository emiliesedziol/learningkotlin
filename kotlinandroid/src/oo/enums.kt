package oo

enum class Direction(degree: Double) {
    NORTH(0.0), EAST(90.0), SOUTH(180.0), WEST(270.0)
}
enum class Suits {
    HEARTS, SPADES, DIAMOND, CLUBS
}

fun main(args: Array<String>) {

    val suit = Suits.SPADES

    val color = when(suit) {
        Suits.HEARTS, Suits.DIAMOND -> "red"
        // Suits.SPADES, Suits.CLUBS -> "black"
        else -> "black"  // either all must be defined or an else needs to be used with the when
    }

    println(color)
}