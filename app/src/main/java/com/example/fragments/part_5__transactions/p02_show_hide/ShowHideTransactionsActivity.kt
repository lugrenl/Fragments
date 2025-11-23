package com.example.fragments.part_5__transactions.p02_show_hide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R
import com.example.fragments.part_5__transactions.Part5FragmentA
import com.example.fragments.part_5__transactions.Part5FragmentB
import com.example.fragments.part_5__transactions.Part5FragmentC

class ShowHideTransactionsActivity : AppCompatActivity(R.layout.activity_part5_p02) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part5_p02_container, Part5FragmentA())
                .add(R.id.activity_part5_p02_container, Part5FragmentB())
                .add(R.id.activity_part5_p02_container, Part5FragmentC())

                .hide(Part5FragmentB())
                .show(Part5FragmentA())

                .commit()
        }
    }
}