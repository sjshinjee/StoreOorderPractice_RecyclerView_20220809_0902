package com.example.storeoorderpractice_recyclerview_20220809_0902.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.storeoorderpractice_recyclerview_20220809_0902.R
import com.example.storeoorderpractice_recyclerview_20220809_0902.databinding.FragmentPizzaStoreBinding
import com.example.storeoorderpractice_recyclerview_20220809_0902.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment() {

    lateinit var binding : FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflater변수안에 inflate있다
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        return binding.root
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}