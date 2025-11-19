package com.example.fragments.part_2__fragment_factory

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.fragments.R

internal class Part2Fragment : Fragment(R.layout.fragment_part2  ) {

    companion object {
        private const val ARGS_TITLE = "args_title"

        fun newInstance(title: String) : Fragment {
            return Part2Fragment().also {
                it.arguments = bundleOf(ARGS_TITLE to title)
            }
        }
    }

    private val titleFromArgs: String
        get(){
            return arguments?.getString(ARGS_TITLE) ?: ""
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.fragment_part2_text_view)
        textView.text = titleFromArgs
    }
}