package com.example.fragments.part_4__lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.fragments.R


internal class Part4Fragment : Fragment(R.layout.fragment_part4){

    companion object {
        private const val ARGS_TITLE = "args_title"
        private const val LOG_TAG = "LifecycleExample"

        fun newInstance(title: String) : Fragment {
            return Part4Fragment().also {
                it.arguments = bundleOf(ARGS_TITLE to title)
            }
        }
    }

    private val title: String
        get(){
            return arguments?.getString(ARGS_TITLE) ?: ""
        }

    private var editText: EditText? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LOG_TAG, "$title - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "$title - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState).also {
            Log.d(LOG_TAG, "$title - onCreateView")
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(LOG_TAG, "$title - onViewCreated")

        view.findViewById<TextView>(R.id.fragment_part4_text_title).text = title

        editText = view.findViewById(R.id.fragment_part4_edit_text)
        Log.d(LOG_TAG, "\t$title - editText.text = '${editText?.text}'")

        view.findViewById<View>(R.id.fragment_part4_button_move).apply {
            setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.activity_part_4_container, newInstance("second"))
                    .addToBackStack(null)
                    .commit()

            }
        }

        view.findViewById<View>(R.id.fragment_part4_button_move_with_animations).apply {
            setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .setCustomAnimations(
                        R.anim.enter_from_right,
                        R.anim.exit_to_left,
                        R.anim.enter_from_left,
                        R.anim.exit_to_right)
                    .replace(R.id.activity_part_4_container, newInstance("third"))
                    .addToBackStack(null)
                    .commit()
            }
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(LOG_TAG, "$title - onViewStateRestored")
        Log.d(LOG_TAG, "\t$title - editText.text = '${editText?.text}'")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "$title - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "$title - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "$title - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "$title - onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG, "$title - onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(LOG_TAG, "$title - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "$title - onDestroy")
    }
}