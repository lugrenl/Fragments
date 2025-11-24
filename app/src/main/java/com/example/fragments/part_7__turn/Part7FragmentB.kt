package com.example.fragments.part_7__turn

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments.R


class Part7FragmentB : Fragment(R.layout.fragment_part7_b) {

    private var buttonClickListener: ButtonClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        buttonClickListener = context as? ButtonClickListener
    }

    override fun onDetach() {
        super.onDetach()
        buttonClickListener = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fragment_part7_button).apply {
            setOnClickListener {
                buttonClickListener?.onButtonClicked()
            }
        }
    }


    interface ButtonClickListener {
        fun onButtonClicked()
    }
}