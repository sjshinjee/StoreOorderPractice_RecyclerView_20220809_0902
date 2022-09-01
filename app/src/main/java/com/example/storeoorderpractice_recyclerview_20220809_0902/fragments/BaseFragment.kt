package com.example.storeoorderpractice_recyclerview_20220809_0902.fragments

import android.content.Context
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    val mContext : Context = requireContext()

    abstract fun setupEvents()
    abstract fun setValues()

}