package com.example.fragments.part_8__communications

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.fragments.R


/**
 * Part 8 -- взаимодействие Activity & fragment
 *
 * - Пример изменения background-a Activity из Fragment
 * - Пример взаимодействия между двумя фрагментами
 */
class ActivityFragmentCommunications
    : AppCompatActivity(R.layout.activity_part_8),
    Part8FragmentA.Part8AFragmentClickListener,
    Part8FragmentB.Part8BFragmentClickListener {

    companion object {
        private val COLORS = listOf(
            R.color.purple_200,
            R.color.purple_700,
            R.color.teal_700
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part8_first_container, Part8FragmentA())
                .add(R.id.activity_part8_second_container, Part8FragmentB())
                .commit()
        }
    }

    override fun changeActivityColor() {
        findViewById<View>(R.id.activity_part8__root_container).apply {
            this.setBackgroundColor(
                ContextCompat.getColor(
                    this@ActivityFragmentCommunications,
                    COLORS.random()
                )
            )
        }
    }

    override fun onButtonClicked() {
        (supportFragmentManager.findFragmentById(R.id.activity_part8_first_container) as? Part8FragmentA)?.showSnackbar()
    }
}