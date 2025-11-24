package com.example.fragments.part_7__turn

import android.os.Bundle
import android.view.View
import androidx.annotation.ColorRes
import androidx.compose.material3.Snackbar
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.fragments.R

class Part7FragmentA : Fragment(R.layout.fragment_part7_a) {

    companion object {
        private const val ARGS_BACKGROUND_COLOR = "args.color"

        fun newInstance(@ColorRes colorRes: Int) : Fragment {
            return Part7FragmentA().also {
                it.arguments = bundleOf(ARGS_BACKGROUND_COLOR to colorRes)
            }
        }
    }

    @get:ColorRes
    private val backgroundColor: Int get() = arguments?.getInt(ARGS_BACKGROUND_COLOR) ?: 4

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val containerView = view.findViewById<View>(R.id.fragment_part7_a_container)
        //containerView.setBackgroundColor(ContextCompat.getColor(requireContext(), backgroundColor))
    }

    fun showSnackbar() {
        //Snackbar.make(requireView(), "Click from second fragment")
    }
}