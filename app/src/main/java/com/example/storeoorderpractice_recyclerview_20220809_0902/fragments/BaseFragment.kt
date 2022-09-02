package com.example.storeoorderpractice_recyclerview_20220809_0902.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    lateinit var mContext : Context
//생명주기 때문에 온뷰크리에이티드안에 mContext초기화 해줘야 한다
//coz View가 생겨야 Context가 발생
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mContext = requireContext()
    }

    abstract fun setupEvents()
    abstract fun setValues()

}