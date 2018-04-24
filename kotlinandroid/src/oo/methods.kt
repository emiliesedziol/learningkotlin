package oo

class Robot (val name: String) {
    fun greetHuman() {
        println("Hi $name")
    }

    fun knowItsName(): Boolean = name.isNotBlank()
}

fun main(args: Array<String>) {

    val fightRobot = Robot("Destroyer9000")

    if (fightRobot.knowItsName()) {
        fightRobot.greetHuman()
    }
}

// Hi Destroyer9000