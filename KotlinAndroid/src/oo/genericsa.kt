package oo

import java.util.*

// 'E' for element
class TimeSeries<E> {
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

fun <E> timeSeriesOf(vararg elements: E): TimeSeries<E> {
    val result = TimeSeries<E>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main(args: Array<String>) {
 val timeSeries: TimeSeries<Int> = TimeSeries()
    timeSeries.add(2)
    timeSeries.getLatest()

    val timeSeries2 = timeSeriesOf("","","")
}