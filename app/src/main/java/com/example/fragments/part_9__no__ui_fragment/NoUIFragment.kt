package com.example.fragments.part_9__no__ui_fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment


class NoUIFragment : Fragment() {

    companion object {
        private const val LOG_TAG = "NoUiFragment"
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LOG_TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true  // чтобы переживало переворот экрана
        Log.d(LOG_TAG, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState).also {
            Log.d(LOG_TAG, "onCreateView")
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(LOG_TAG, "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(LOG_TAG, "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG, "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(LOG_TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    fun showDialog() {
        AlertDialog.Builder(requireContext())
            .setTitle("No ui fragment dialog")
            .setMessage("I still can show dialogs")
            .setPositiveButton("Ok") {dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}