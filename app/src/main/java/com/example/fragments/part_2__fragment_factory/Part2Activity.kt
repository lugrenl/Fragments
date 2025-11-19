package com.example.fragments.part_2__fragment_factory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R


/**
 * Part 2 -- Fragment factory
 *
 * Пример переиспользования фрагментов -- проброс данных во фрагмент
 *
 * - Создаём фрагмент
 * - Добавляем аргумент
 */
class Part2Activity : AppCompatActivity(R.layout.activity_part_2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .add(
                R.id.activity_part2_container,
                Part2Fragment.newInstance("Part2ActivityTitle")
            )
            .commit()
    }
}