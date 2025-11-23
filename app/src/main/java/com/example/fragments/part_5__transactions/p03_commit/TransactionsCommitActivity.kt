package com.example.fragments.part_5__transactions.p03_commit

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R
import com.example.fragments.part_5__transactions.Part5FragmentA


class TransactionsCommitActivity : AppCompatActivity(R.layout.activity_part5_p03) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            Handler(Looper.getMainLooper()).postDelayed({
                supportFragmentManager.beginTransaction()
                    .add(R.id.activity_part5_p03_container, Part5FragmentA())
                    .commit()
            }, 3000L)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {

//        supportFragmentManager.beginTransaction()
//            .add(R.id.activity_part5_p03_container, Part5FragmentA())
//            .commitAllowingStateLoss()

        super.onSaveInstanceState(outState)
    }
}
