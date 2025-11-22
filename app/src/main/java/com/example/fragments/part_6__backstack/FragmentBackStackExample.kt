package com.example.fragments.part_6__backstack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R


/**
 * Part 6 -- Back stack
 *
 * - Пример 1 -- Добавить несколько фрагментов подряд в back stack
 * - Пример 2 -- Добавить несколько фрагментов в 1 транзакции
 */

class FragmentBackStackExample : AppCompatActivity(R.layout.activity_part_6) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .add(R.id.activity_part6_container, Part6FragmentA())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_part6_container, Part6FragmentB())
            .replace(R.id.activity_part6_container, Part6FragmentC())
            .addToBackStack(null)
            .commit()

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.activity_part6_container, Part6FragmentC())
//            .addToBackStack(null)
//            .commit()
    }
}