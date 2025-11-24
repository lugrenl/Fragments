package com.example.fragments.part_8__communications

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fragments.R
import com.google.android.material.snackbar.Snackbar

class Part8FragmentA : Fragment(R.layout.fragment_part8_a) {

    private var part8AFragmentClickListener: Part8AFragmentClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        part8AFragmentClickListener = context as? Part8AFragmentClickListener
    }

    override fun onDetach() {
        super.onDetach()
        part8AFragmentClickListener = null

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.fragment_part8_a_button).apply {
            setOnClickListener {
                part8AFragmentClickListener?.changeActivityColor()
            }
        }
    }

    fun showSnackbar() {
        Snackbar.make(
            requireView(),
            "Click from Part8 Fragment",
            Snackbar.LENGTH_SHORT
        ).show()
    }

    interface Part8AFragmentClickListener {
        fun changeActivityColor()
    }
}