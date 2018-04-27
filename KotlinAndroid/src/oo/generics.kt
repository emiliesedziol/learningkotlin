package oo

import java.util.*


// 'E' for element
class Timeline<E> {
    val date2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Data.put(Date(), element)
    }

    fun addAll(elements: Collection<E>) {
        elements.forEach { add(it) }
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}

fun <E> timelineOf(vararg elements: E): Timeline<E> {
    val result = Timeline<E>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main(args: Array<String>) {
 val timeline: Timeline<Int> = Timeline()
    timeline.add(2)
    timeline.getLatest()

    val timeline2 = timelineOf("","","")
}