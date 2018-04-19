package basics

fun main(args: Array<String>) {

    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    val data2List = listOf(
            data.getValue("users1.csv"),
            data.getValue("users2.csv"),
            data.getValue("users3.csv"),
            data.getValue("users4.csv")
    )

    var cnt = 0
    for ((key, value) in data) {
        println("entry $key")
        println("data")
        println("value $value")

        val check1 = value.isEmpty()
//        println("check1 $check1")
        val check2 = value.any{ it < 0 }
//        println("check2 $check2")

        if ((check1) || (check2)) {
            println("is not value $key")
            cnt++
        }
    }
    println("Number of invalid Maps $cnt")
/*
entry users1.csv
data
value [32, 45, 17, -1, 34]
is not value users1.csv
entry users2.csv
data
value [19, -1, 67, 22]
is not value users2.csv
entry users3.csv
data
value []
is not value users3.csv
entry users4.csv
data
value [56, 32, 18, 44]
Number of invalid Maps 3
*/

    val flattened = data2List.flatMap{ it.sorted()}.filter({ it > 0  })
    println("flattened")
    println(flattened)

    val flattenedA = data2List.flatMap{ it.sorted()}.filter({ it > 0  }).average()
    val flattened2 = flattened.average()
    println("")
    println("average not rounding")
    println(flattenedA)
    println("average rounding")
    println("%.2f".format(flattened2))

/*    flattened
    [17, 32, 34, 45, 19, 22, 67, 18, 32, 44, 56]

    average not rounding
    35.09090909090909
    average rounding
            35.09
*/


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
     println(" average ages $avgAge")/*
    [32, 45, 17, -1, 34]
    [32, 45, 17, 34]
    average A age 25.4

    [19, -1, 67, 22]
    [19, 67, 22]
    average B age 26.75

    []
    []
    average age NaN

    [56, 32, 18, 44]
    [32, 45, 17, 34]
    average D age 37.5
    average ages NaN

    Process finished with exit code 0
    */
}

