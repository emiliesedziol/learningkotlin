package oo

// import oo.House.Companion.getNormalHouse
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import oo.House.Companion.getNormalHouse as createHouse
// import basics.PI
// import basics.getExternalInput

object CountryFactory {
    val a = 4
    fun createCountry() = Country("Australia")
}

object DefaultClickListener: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("mouse was clicked")
    }
}

fun main(args: Array<String>) {

    CountryFactory.a
    CountryFactory.createCountry()
    // getNormalHouse()
    createHouse()
}