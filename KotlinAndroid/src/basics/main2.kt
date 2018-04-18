package basics

fun main(args: Array<String>) {

   /* val input = Scanner(System.`in`) */
    val l: MutableList<Int> = mutableListOf<Int>()
    for (i in 1..100) {
        val randomNumber:Int  =  random(0, 100)

        l.add(randomNumber)
    }
    println(l)
    var b:Boolean = true
    var cnt = 0
    while (b) {
        var c = l[cnt]
        println("$b  $c")
        if (c<10) {
            b = false
        }
        cnt += 1
    }
}

fun random(from: Int, to: Int) = (Math.random() * (to - from) + from).toInt()
