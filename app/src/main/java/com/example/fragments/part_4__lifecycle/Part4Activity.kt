package com.example.fragments.part_4__lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R
import com.example.fragments.part_1__simple_fragment.Part1Fragment


/**
 * Part 4 -- Fragment`s lifecycle
 *
 * - LifecycleExampleFragment - просто фрагмент с логами
 * - Добавляем вёрстку EditText, кейс с переворотом экрана
 * - Don`t keep асtivities - смотрим на логи
 * - Переходы на следующий fragment (без анимации)
 * - Переход на следующий фрагмент (с анимацией)
 *
 * - Lifecycle-aware компонент
 */

class Part4Activity : AppCompatActivity(R.layout.activity_part_4) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part_4_container, Part4Fragment.newInstance("first"))
                .commit()
        }
    }
}