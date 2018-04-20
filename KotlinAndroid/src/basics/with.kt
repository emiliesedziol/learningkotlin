package basics

fun main(args: Array<String>) {

    val props = System.getProperties()

    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.nome"))
    }
    // same code without the 'with'
    props.list(System.out)
    props.propertyNames().toList()
}