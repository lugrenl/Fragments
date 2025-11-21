package com.example.fragments.part_3__fragment_managers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.fragments.R


/**
 * Part 3 -- Fragment Manager
 *
 * Показываем разницу между supportFragmentManager / parentFragmentManager / childFragmentManager
 *
 * - Создадим 3 фрагмента для использования в ViewPager, простая вёрстка для того, чтобы отличить фрагменты
 * - Создаём адаптер для ViewPager-a (FragmentStateAdapter)
 * - Используем конструктор с FragmentManager-ом
 * - Настраиваем адаптер из Activity
 * - Настраиваем адаптер из Fragmment
 * - Включаем режим <Don`t keep activities>
 */

class Part3Activity : AppCompatActivity(R.layout.activity_part_3) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val viewPager = findViewById<ViewPager2>(R.id.activity_part_3_viewPager)
//        viewPager.adapter = MyViewPagerAdapter(
//            fragmentManager = supportFragmentManager,
//            lifecycle = lifecycle
//        )

        supportFragmentManager.beginTransaction()
            .add(R.id.activity_part_3_container, Part3RootFragment())
            .commit()
    }
}

class MyViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Part3FragmentA()
            1 -> Part3FragmentB()
            else -> Part3FragmentC()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }

}