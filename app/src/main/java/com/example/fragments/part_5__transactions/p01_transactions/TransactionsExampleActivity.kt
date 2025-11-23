package com.example.fragments.part_5__transactions.p01_transactions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R
import com.example.fragments.part_5__transactions.Part5FragmentA
import com.example.fragments.part_5__transactions.Part5FragmentB
import com.example.fragments.part_5__transactions.Part5FragmentC


/**
 * Part 5 -- FragmentTransaction
 *
 * - Создаём в вёрстке 2 контейнера -
 *      один для кнопок с разными действиями, второй - для добавления новых фрагментов
 * - Настраиваем root фрагмент, добавляем кнопки для add (2 штуки), replace && remove
 * - Реализуем методы для контейнера # 2
 */

class TransactionsExampleActivity : AppCompatActivity(R.layout.activity_part_5),
    Part5RootFragment.TransactionsButtonListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part5_container_root, Part5RootFragment())
                .commit()
        }
    }

    override fun addFragmentA() {
        supportFragmentManager.beginTransaction()
            .add(R.id.activity_part5_container, Part5FragmentA())
            .commit()
    }

    override fun addFragmentB() {
        supportFragmentManager.beginTransaction()
            .add(R.id.activity_part5_container, Part5FragmentB())
            .commit()
    }

    override fun replaceWithFragmentC() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_part5_container, Part5FragmentC())
            .commit()
    }

    override fun removeLastFragment() {
        if (supportFragmentManager.fragments.size > 1) {
            supportFragmentManager.beginTransaction()
                .remove(supportFragmentManager.fragments.last())
                .commit()
        }
    }
}