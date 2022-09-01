package com.example.storeoorderpractice_recyclerview_20220809_0902.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.storeoorderpractice_recyclerview_20220809_0902.R
import com.example.storeoorderpractice_recyclerview_20220809_0902.databinding.FragmentPizzaStoreBinding

class PizzaStoreFragment : BaseFragment() {

    lateinit var binding : FragmentPizzaStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflater변수안에 inflate있다
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pizza_store, container, false)
        return binding.root
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}