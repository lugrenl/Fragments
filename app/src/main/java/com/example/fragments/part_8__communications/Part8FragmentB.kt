package com.example.fragments.part_8__communications

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fragments.R

class Part8FragmentB : Fragment(R.layout.fragment_part8_b) {

    private var part8BFragmentClickListener: Part8BFragmentClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        part8BFragmentClickListener = context as? Part8BFragmentClickListener
    }

    override fun onDetach() {
        super.onDetach()
        part8BFragmentClickListener = null

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.fragment_part8_b_button).apply {
            setOnClickListener {
                part8BFragmentClickListener?.onButtonClicked()
            }
        }
    }
    interface Part8BFragmentClickListener {
        fun onButtonClicked()
    }
}