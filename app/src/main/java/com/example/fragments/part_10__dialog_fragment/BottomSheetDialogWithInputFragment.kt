package com.example.fragments.part_10__dialog_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.example.fragments.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetDialogWithInputFragment :  BottomSheetDialogFragment() {

    companion object {
        private const val TAG = "BottomSheetDialogWithInputFragment"

        fun show(fragmentManager: FragmentManager) {
            val dialogFragment = BottomSheetDialogWithInputFragment()

            dialogFragment.show(fragmentManager, TAG)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_part_10_dialog_with_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fragment_part10_dialog__button).apply {
            setOnClickListener {
                this@BottomSheetDialogWithInputFragment.dismissAllowingStateLoss()
            }
        }
    }

}