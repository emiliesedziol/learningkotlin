/*
* Kotlin
* Tools - Kotlin - Kotlin REPL
*/
/* no primitive types in Kotlin */
var b = 2  is the same as  var b: Int = 2
b <ctrl-enter> returns 2

b = 4
b <ctrl-enter> returns 4
/* immutable variable */

val name = "bill"  /* name cannot be assigned another value */

val isDeveloper: Boolean = true

val title = "Kotlin" is the same as val title: String = "Kotlin"

/* cannot set a variable to null without a syntax change
val str: String = null  <-- doesn't work

val str: String? = null    <-- does work

str!!.lenght  <-- returns lotlin.LotlinNullPointerException

str?.lenght  <-- will return a null - safe

val str: String? = "bill"

str?.length  <-- returns 4

?:  <-- elvis operator

val strLength = str?.length ?: 0   <-- zero is the default value

val str: String? = null
val strLength = str?.length ?: 0
strLength  <-- returns '0' zero

val str: String? = "bill"
val strLength = str?.length ?: 0
strLength  <-- returns 4

/*
* setting value x in an if statement
*/
val i = 17

val x = if (i<15) {
	println("i is small")
	"small"  /* the return value put into x has to be in the last line
} else if (i>=15 && i <=25) {
	println("in between")
	"medium"
} else {
	println(" i is large")
	"large"
}
x <ctl-enter>
in betweenmedium  // is returned

* run 7 - 18 and <ctrl-enter> only it returns in between
* then 'x' <ctrl-enter> returns medium

val str: String? = "Kotlin"
if (str != null) {
	println(str.length)
}
6  < is returned


/* when statements
* once a condition is hit the condition breaks out
*/

val price = 29
when(price) {
	0 -> println("for free")   // zero -> checking if price is zero
	in 1..19 -> println("on sale")  // one to 19 price is on sale
	in 20..29 -> println("normal")
	10 + 20 -> println("20")
	else -> println("overpriced")  // default
}
val price = 29
when {
	price <- 19 -> println("for free")  /* must be a boolean expression
	price <- 29 -> println("normal")
	else -> println("overpriced")
}

val price = 9
val x = when {
	price <= 19 -> "for free"
	price <= 29 -> "normal"
	else -> "overpriced"
}
x /* is overpriced  set as a string value


/*
* collections
* List<>  cannot be changed
* MutableList<> can be added to and removed elements
*/

val array = arrayOf(2, 3, 5, 7, 11, 13)

array.joinToString()   /* returns 2, 3, 5, 7, 11, 13

val bArray = intArrayOf(2, 3, 4)

val cList = listOf (1, 1, 2, 2,)

val mList = mutableListOf(1, 1, 1)
mList[0] = 9
mList
[9, 1, 1]


val map = mapOf(Pair(1, "a"), Pair(2, "b"))
map
{1=a, 2=b}

val mMap = mutableMapOf(1 to "Kotlin", 2 to "Andriod")
mMap
{1=Kotlin, 2=Andriod}

val hMap = hashMapOf("name" to "bill", "make" to "lexus", "loan" to 5200000, "paidOff" to 3200000)
println(hMap["name"])
bill

println(hMap["loan"])
5200000

println(hMap)
{name=bill, loan=5200000, make=lexus, paidOff=3200000}


/* loops

for (i in 1..10) {
	print("$i ")
}
1 2 3 4 5 6 7 8 9 10 

for (c in "Kotlin") {
	print("$c ")
}

K o t l i n 

val languages = listOf("English", "French", "German")
for (lang in languages) {
	println("$lang, ")
}
English, French, German, 

for (i in 10 downTo 1) {
	print("$i ")
}
10 9 8 7 6 5 4 3 2 1 

for (i in 10 downTo 1 step 2) {
	print("$i ")
}
10 8 6 4 2 

/* while

var i = 1
while (i <=10) {
	print("$i ")
	i++
}
1 2 3 4 5 6 7 8 9 10 

do {
	print(i)
	i++
} while (i <=20)
11121314151617181920

/* functions
* second value is what is returned
*/

fun permitEntrance(age: Int): Boolean {
	return age >= 18
}

permitEntrance(9)
false

permitEntrance(21)
true

fun permitEntrance(age: Int): Boolean  = age >= 18

val granted = permitEntrance(11)

granted
false


fun permitEntrance(vararg ages: Int): Boolean {
	return ages.any {age -> age >= 18 }
}
permitEntrance(11,12)
false

permitEntrance(21,22,23)
true

permitEntrance(11,12,22)
true

/*
* intellJ
* <ctrl-shift-F10> to execute
*/

val PI = 3.1415
fun main(args: Array<String>) {
    val list = listOf("Kotlin", "Android")
    println(list)
    println(PI)
}

[Kotlin, Android]
3.1415

package basics
import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val name = input.next()
    println(name)
}
fun main(args: Array<String>) {

  val anonymous = "Anonymous"

  print("Enter your name: ")
  val input = readLine()

  // Use anonymous name if none is given
  val name = if (input != null && input.isNotBlank()) {
    input
  } else {
    anonymous
  }

  // Another if-expression
  val message = if (name == anonymous) {
    "Conscious about your privacy, eh?"
  } else {
    "Welcome $name, the CIA has been informed of your name :)"
  }

  println(message)  // You could also directly use println() above
}



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
[56, 86, 28, 38, 70, 24, 80, 73, 48, 78, 37, 46, 98, 7, 47, 79, 33, 3, 74, 26, 81, 77, 6, 20, 30, 67, 34, 17, 20, 80, 17, 92, 88, 94, 72, 18, 95, 20, 56, 7, 69, 97, 22, 41, 35, 2, 87, 21, 0, 5, 79, 56, 23, 55, 51, 92, 81, 88, 31, 11, 35, 66, 87, 68, 63, 16, 54, 39, 41, 91, 22, 20, 28, 43, 28, 87, 7, 38, 73, 76, 40, 23, 25, 19, 89, 38, 54, 23, 54, 70, 89, 90, 10, 41, 94, 77, 92, 29, 92, 93]
true  56
true  86
true  28
true  38
true  70
true  24
true  80
true  73
true  48
true  78
true  37
true  46
true  98
true  7

fun main(args: Array<String>) {

  val randoms: MutableList<Int> = mutableListOf()  // you can also use mutableListOf<Int>()

  for (i in 1..100) {
    randoms.add(Random().nextInt(100) + 1)
  }

  var i = 0
  while (i < randoms.size && randoms[i] > 10) {
    println(randoms[i])
    i++
  }
}

package basics

fun main(args: Array<String>) {

    val together = concat(listOf("Kotlin", "Java", "Pick"))
    println(together)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString (  separator )
Kotlin, Java, Pick

fun main(args: Array<String>) {

    val together = concat(listOf("Kotlin", "Java", "Pick"), " : ")
    println(together)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)
Kotlin : Java : Pick

