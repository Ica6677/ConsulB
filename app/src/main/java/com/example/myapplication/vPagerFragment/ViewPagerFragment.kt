package com.example.myapplication.vPagerFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentViewPagerBinding
import com.example.myapplication.vPagerFragment.screens.OnBoarding1
import com.example.myapplication.vPagerFragment.screens.OnBoarding2
import com.example.myapplication.vPagerFragment.screens.OnBoarding3

class ViewPagerFragment : Fragment() {
    lateinit var binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_view_pager,
            container,false)
        binding = FragmentViewPagerBinding.bind(view)
        val fragmentlist = arrayListOf(
            OnBoarding1(),
            OnBoarding2(),
            OnBoarding3()
        )

        val adapter = ViewPagerAdapter(fragmentlist,requireActivity().supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        return view
    }
}