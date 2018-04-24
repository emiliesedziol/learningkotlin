package oo

class House(val numberOfRooms: Int, val price: Double) {
    companion object {
        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House( 6, 1990000.0)
        fun getLuxuryHouse() = House(42, 5990000.0)
    }
}

fun main(args: Array<String>) {

    val normalHouse = House.getNormalHouse()
    println(normalHouse.price)

    println(House.HOUSES_FOR_SALE)
}