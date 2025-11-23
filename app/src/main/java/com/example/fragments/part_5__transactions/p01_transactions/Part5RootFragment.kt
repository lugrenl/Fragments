package com.example.fragments.part_5__transactions.p01_transactions

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class Part5RootFragment : Fragment(R.layout.fragment_part5_root) {

    private var transactionsButtonsListener: TransactionsButtonListener? = null

    private var counterTextView: TextView? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        transactionsButtonsListener = context as? TransactionsButtonListener
        }

    override fun onDetach() {
        transactionsButtonsListener = null
        super.onDetach()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        counterTextView = view.findViewById(R.id.fragment_part5_root_text__counter)

        view.findViewById<View>(R.id.fragment_part5_button__add_a_fragment).apply {
            setOnClickListener {
                transactionsButtonsListener?.addFragmentA()
                changeFragmentsCounterText()

            }
        }

        view.findViewById<View>(R.id.fragment_part5_button__add_b_fragment).apply {
            setOnClickListener {
                transactionsButtonsListener?.addFragmentB()
                changeFragmentsCounterText()
            }
        }

        view.findViewById<View>(R.id.fragment_part5_button__replace_with_c_fragment).apply {
            setOnClickListener {
                transactionsButtonsListener?.replaceWithFragmentC()
                changeFragmentsCounterText()
            }
        }

        view.findViewById<View>(R.id.fragment_part5_button__remove_last_fragment).apply {
            setOnClickListener {
                transactionsButtonsListener?.removeLastFragment()
                changeFragmentsCounterText()
            }
        }
    }

    private fun changeFragmentsCounterText() {
        // handler - потому, что commit() - асинхронный
        Handler(Looper.getMainLooper()).postDelayed({
            val count = parentFragmentManager.fragments.size - 1 // считаем без root фрагмента
            counterTextView?.text = "Fragments count: $count"
        }, 100L)
    }

    interface TransactionsButtonListener {
        fun addFragmentA()
        fun addFragmentB()
        fun replaceWithFragmentC()
        fun removeLastFragment()
    }
}