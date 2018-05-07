package com.example.habittrainer

import android.graphics.Bitmap

data class Habit(val title: String, val description: String, val image: Bitmap)

/*fun getSampleHabits(): List<Habit> {
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
} */