package com.example.fragments.part_9__no__ui_fragment

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R


/**
 * Part 9 -- No UI fragment
 *
 * - Создание no ui fragment
 * - Некоторые методы жизненного цикла у no UI fragment не вызываются
 * - Но такой фрагмент всё ещё может показать диалог, например
 * - С помощью retain-fragment
 */
class NoUiFragmentActivity : AppCompatActivity(R.layout.activity_part_9) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part9__container, NoUIFragment())

        }

        findViewById<Button>(R.id.activity_part9__button).apply {
            setOnClickListener {
                val noUiFragment =
                    (supportFragmentManager.findFragmentById(R.id.activity_part9__container) as? NoUIFragment)
                noUiFragment?.showDialog()
            }
        }
    }
}