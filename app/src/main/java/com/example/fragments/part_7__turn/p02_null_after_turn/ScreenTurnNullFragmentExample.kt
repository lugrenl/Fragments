package com.example.fragments.part_7__turn.p02_null_after_turn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R
import com.example.fragments.part_7__turn.Part7FragmentA
import com.example.fragments.part_7__turn.Part7FragmentB


class ScreenTurnNullFragmentExample
    : AppCompatActivity(R.layout.activity_part_7_p02), Part7FragmentB.ButtonClickListener {

        private lateinit var firstFragmentA: Part7FragmentA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            firstFragmentA = Part7FragmentA.newInstance(R.color.purple_500) as Part7FragmentA

            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part7_p02_first_container, firstFragmentA)
                .add(R.id.activity_part7_p02_second_container, Part7FragmentB())
                .commit()
        } else {
            firstFragmentA = supportFragmentManager.findFragmentById(R.id.activity_part7_p02_first_container) as Part7FragmentA
        }
    }

    override fun onButtonClicked() {
        firstFragmentA.showSnackbar()
    }
}