package com.example.fragments.part_1__simple_fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R


/**
 * Part 1 -- Hello, fragments
 *
 * Первое знакомство с фрагментами.
 *
 * - Создаём фрагмент
 * - Проверяем зависимости от нужных библиотек
 * - Вёрстка фрагментов
 * - Правильный метод жизненного цикла и конструктор
 * - Добавление фрагмента в вёрстку (<fragment/> vs <FragmentContainerView/>)
 * - Добавление фрагмента из кода
 */

class Part1Activity : AppCompatActivity(R.layout.activity_part_1) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction()
            .add(
                R.id.activity_part1_fragment_container_view,
                Part1Fragment()
            )
            .commit()
    }
}