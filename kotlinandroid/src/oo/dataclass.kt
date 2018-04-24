package oo

// generates hashCode(), equals(), toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode:String, val city: String)

fun main(args: Array<String>) {

    val residence = Address("other ave", 42, "44321", "buffalo")
    val residence2 = Address("other ave", 42, "44321", "buffalo")
//toString
    println(residence)
// referential equality - different objects
    println(residence === residence2)
//structural equality, in Java equals()
    println(residence == residence2)

    val neighbor = residence.copy(number = 44)
    println("neighbor $neighbor")

    //destructuring
    println("destructuring")
    residence.component1()  // is for street
    val (street, number, postCode, city) = residence
    // val (street, number, _, city) = residence  // underscore is a place holder
    println("$street, $number, $postCode, $city")
}

/*
Address(street=other ave, number=42, postCode=44321, city=buffalo)
false
true
neighbor Address(street=other ave, number=44, postCode=44321, city=buffalo)
destructuring
other ave, 42, 44321, buffalo

 */