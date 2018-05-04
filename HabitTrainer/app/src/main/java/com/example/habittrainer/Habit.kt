package com.example.habittrainer

data class Habit(val title: String, val description: String, val image: Int)

fun getSampleHabits(): List<Habit> {
    return listOf(
            Habit("Go for a walk",
                    "walk in the sun",
                    R.drawable.walk),

            Habit("Drink water",
                    "fully hydrated",
                    R.drawable.water),

            Habit("Hawk",
                    "Watch out",
                    R.drawable.bird)
    )
}