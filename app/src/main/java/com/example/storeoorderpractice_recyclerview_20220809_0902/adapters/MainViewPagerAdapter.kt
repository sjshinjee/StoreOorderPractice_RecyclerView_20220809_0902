package com.example.storeoorderpractice_recyclerview_20220809_0902.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.storeoorderpractice_recyclerview_20220809_0902.fragments.PizzaStoreFragment
import com.example.storeoorderpractice_recyclerview_20220809_0902.fragments.ProfileFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> PizzaStoreFragment()
            else -> ProfileFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "피자 주문"
            else -> "내 정보 수정"
        }
    }
}