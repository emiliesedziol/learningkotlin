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

/* checked exception
package basics;

import java.io.IOException;

public class MainCheckException {
    public static void main(String[] args) {
        try {
            canThrowAnException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void canThrowAnException() throws IOException {

        throw new IOException();
    }
}

/* unchecked exception
package basics;


public class MainCheckException {
    public static void main(String[] args) {
        canThrowAnException();
    }

    static void canThrowAnException() {

        throw new IllegalStateException();
    }
}



fun main(args: Array<String>) {

    val timesTwo = { x: Int -> x*2 }
    val add: (Int, Int) -> Int = { x: Int, y:Int -> x + y }

    val list = (1..100).toList()

    println(list.filter({ element -> element % 2 == 0}))  // java verion

	println(list.filter({ it % 2 == 0}))  // kotlin
}
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]

Process finished with exit code 0

package basics

fun main(args: Array<String>) {

    val timesTwo = { x: Int -> x*2 }
    val add: (Int, Int) -> Int = { x: Int, y:Int -> x + y }

    val list = (1..100).toList()

    println("Java")
    println(list.filter({ element -> element % 2 == 0}))


    println("Kotlin ")
    println(list.toString())
    println(list.filter({ it % 2 == 0}))

    println("Kotlin using a function")
    println(list.toString())
    println(list.filter({ it.even() }))
    println(list.filter{ it.even() })  // can also be coded as this

    println("is even")
    println(list.toString())
    println(list.filter(::isEven))

    println("is odd")
    println(list.filter(::isOdd))

}

fun isEven(i: Int) = i % 2 == 0

fun isOdd(i: Int) = i % 2 != 0

fun Int.even() = this % 2 == 0
Java
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
Kotlin 
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
Kotlin using a function
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
is even
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
is odd
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]


fun main(args: Array<String>) {

    val list = (1..100).toList()

    val doubled = list.map { element -> element * 2 }

    println(doubled)
}
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 150, 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 184, 186, 188, 190, 192, 194, 196, 198, 200]

package basics

fun main(args: Array<String>) {

    val list = (1..100).toList()

    val doubled = list.map { element -> element * 2 }

    //same ad

    list.map { it * 2 }

    println(doubled)

    val average = list.average()
    println("average")
    println(average)

    val shifted = list.map{ it - average}
    println("shifted")
    println(shifted)

    // flatMap()
    val nestedList = listOf(
            (1..10).toList(),
            (1..20).toList(),
            (21..30).toList()
    )

    val notFlattened = nestedList.map { it.sortedDescending() }
    println("nested lists")
    println(notFlattened)

    val flattened = nestedList.flatMap{ it.sortedDescending() }
    println("flattened")
    println(flattened)
}
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 150, 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 184, 186, 188, 190, 192, 194, 196, 198, 200]
average
50.5
shifted
[-49.5, -48.5, -47.5, -46.5, -45.5, -44.5, -43.5, -42.5, -41.5, -40.5, -39.5, -38.5, -37.5, -36.5, -35.5, -34.5, -33.5, -32.5, -31.5, -30.5, -29.5, -28.5, -27.5, -26.5, -25.5, -24.5, -23.5, -22.5, -21.5, -20.5, -19.5, -18.5, -17.5, -16.5, -15.5, -14.5, -13.5, -12.5, -11.5, -10.5, -9.5, -8.5, -7.5, -6.5, -5.5, -4.5, -3.5, -2.5, -1.5, -0.5, 0.5, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5, 11.5, 12.5, 13.5, 14.5, 15.5, 16.5, 17.5, 18.5, 19.5, 20.5, 21.5, 22.5, 23.5, 24.5, 25.5, 26.5, 27.5, 28.5, 29.5, 30.5, 31.5, 32.5, 33.5, 34.5, 35.5, 36.5, 37.5, 38.5, 39.5, 40.5, 41.5, 42.5, 43.5, 44.5, 45.5, 46.5, 47.5, 48.5, 49.5]
nested lists
[[10, 9, 8, 7, 6, 5, 4, 3, 2, 1], [20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1], [30, 29, 28, 27, 26, 25, 24, 23, 22, 21]]
flattened
[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21]

Process finished with exit code 0


fun main(args: Array<String>) {

    val list = (1..1000).toList()

    val first10 = list.take(10)
    val withoutfirst900 = list.drop(900)
    println("first10")
    println(first10)
    println("withoutfirst900")
    println(withoutfirst900)

    println("")
    val list1 = generateSequence(0) { it + 10 }
    val first = list1.take(10).toList()
    val first20 = list1.take(20).toList()
    println("first10")
    println(first)
    println("first20")
    println(first20)

    println("")
    val list2 = generateSequence(0) {
        println("Calculating ${it+10}")
        it + 10
    }
    val firstb = list2.take(10).toList()
    val firstb20 = list2.take(20).toList()
    println("firstb")
    println(firstb)
    println("firstb20")
    println(firstb20)
}
first10
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
withoutfirst900
[901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000]

first10
[0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
first20
[0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190]

Calculating 10
Calculating 20
Calculating 30
Calculating 40
Calculating 50
Calculating 60
Calculating 70
Calculating 80
Calculating 90
Calculating 10
Calculating 20
Calculating 30
Calculating 40
Calculating 50
Calculating 60
Calculating 70
Calculating 80
Calculating 90
Calculating 100
Calculating 110
Calculating 120
Calculating 130
Calculating 140
Calculating 150
Calculating 160
Calculating 170
Calculating 180
Calculating 190
firstb
[0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
firstb20
[0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190]

Process finished with exit code 0


package basics

fun main(args: Array<String>) {

    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    // pair of string to boolean
    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapping = list.zip(list.map { it.contains("t")})

    println(zipped)
    println(mapping)
}
[(Hi, false), (there, true), (Kotlin, true), (fans, false)]
[(Hi, false), (there, true), (Kotlin, true), (fans, false)]

Process finished with exit code 0

fun main(args: Array<String>) {

    val timesTwo = { x: Int -> x*2 }
    val add: (Int, Int) -> Int = { x: Int, y:Int -> x + y }

    val list = (1..100).toList()

    println("Java")
    println(list.filter({ element -> element % 2 == 0}))


    println("Kotlin ")
    println(list.toString())
    println(list.filter({ it % 2 == 0}))

    println("Kotlin using a function")
    println(list.toString())
    println(list.filter({ it.even() }))
    println(list.filter{ it.even() })  // can also be coded as this

    println("is even")
    println(list.toString())
    println(list.filter(::isEven))

    println("is odd")
    println(list.filter(::isOdd))

}

fun isEven(i: Int) = i % 2 == 0

fun isOdd(i: Int) = i % 2 != 0

fun Int.even() = this % 2 == 0
Java
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
Kotlin 
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
Kotlin using a function
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
is even
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100]
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
is odd
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]

Process finished with exit code 0