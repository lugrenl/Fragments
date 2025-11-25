package com.example.fragments.part_10__dialog_fragment

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.R


/**
 * Part 10 -- DialogFragment
 *
 * - Создание AlertDialog-a из fragment
 * - Переворот экрана
 * - Пример исполльзования DialogFragment - через childFragmentManager
 * - Как работает при перевороте экрана
 */

class DialogsFragmentsActivity : AppCompatActivity(R.layout.activity_part_10) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            // Example 1
//            AlertDialog.Builder(this)
//                .setTitle("Alert in activity")
//                .setMessage("Show example")
//                .setPositiveButton("Ok") { dialog, _ ->
//                    dialog.dismiss()
//                }
//                .create()
//                .show()

            // Example 2
//            BottomSheetDialogWithInputFragment.show(supportFragmentManager)
            //Example 3
//            DialogWithInputFragment.show(supportFragmentManager)
            // Example 4
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_part10__container, Part10Fragment())
                .commit()
        }
    }
}