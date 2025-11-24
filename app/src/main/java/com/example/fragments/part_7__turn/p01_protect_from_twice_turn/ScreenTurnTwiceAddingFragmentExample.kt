package com.example.fragments.part_7__turn.p01_protect_from_twice_turn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R
import com.example.fragments.part_7__turn.Part7FragmentA
import kotlin.random.Random

/**
 * Part 7 -- Переворот экрана (пересоздание активити)
 *
 * - Что будет, если не сделать проверку на savedInstantState
 */

class ScreenTurnTwiceAddingFragmentExample : AppCompatActivity(R.layout.activity_part_7_p01) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val randomColor = when (Random.nextInt(3)) {
            0 -> R.color.purple_200
            1 -> R.color.purple_700
            2 -> R.color.teal_200
            else -> R.color.black
        }

        if (savedInstanceState != null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part7_container, Part7FragmentA.newInstance(randomColor))
                .addToBackStack(null)
                .commit()
        }
    }
}