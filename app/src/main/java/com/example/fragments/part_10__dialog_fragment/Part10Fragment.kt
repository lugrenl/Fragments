package com.example.fragments.part_10__dialog_fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.fragments.R

class Part10Fragment : Fragment(R.layout.fragment_part_10) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fragment_part10_button).apply {
            setOnClickListener {
                AlertDialog.Builder(requireContext())
                .setTitle("Alert in activity")
                .setMessage("Show example")
                .setPositiveButton("Ok") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()
                .show()
            }

//            BottomSheetDialogWithInputFragment.show(childFragmentManager)
//            DialogWithInputFragment.show(childFragmentManager)
        }
    }

}