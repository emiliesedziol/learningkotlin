package basics

fun main(args: Array<String>) {

    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    println(data.getValue("users1.csv"))
    val usersA = data.getValue("users1.csv")
    println(usersA.filter({ it > 0  }))
    val averageA = usersA.average()
    println("average A age $averageA")
    println("")

    println(data.getValue("users2.csv"))
    val usersB = data.getValue("users2.csv")
    println(usersB.filter({ it > 0  }))
    val averageB = usersB.average()
    println("average B age $averageB")
    println("")

    println(data.getValue("users3.csv"))
    val usersC = data.getValue("users3.csv")
    println(usersC.filter({ it > 0  }))
    val averageC = usersC.average()
    println("average age $averageC")
    println("")

    println(data.getValue("users4.csv"))
    val usersD = data.getValue("users4.csv")
    println(usersA.filter({ it > 0  }))
    val averageD = usersD.average()
    println("average D age $averageD")

    val listAges: List<Int> = listOf<Int>()


    val avgAge = listAges.average()
    println(" average ages $avgAge")

}