package com.example.fragments.part_3__fragment_managers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.fragments.R

class Part3RootFragment : Fragment(R.layout.fragment_part3_root) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = view.findViewById<ViewPager2>(R.id.fragment_part_3_viewPager)
        viewPager.adapter = MyViewPagerAdapter(
            fragmentManager = childFragmentManager,
            lifecycle = lifecycle
        )
    }
}