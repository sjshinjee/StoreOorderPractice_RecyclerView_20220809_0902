package com.example.storeoorderpractice_recyclerview_20220809_0902

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.storeoorderpractice_recyclerview_20220809_0902.databinding.ActivityDetailStoreBinding
import com.example.storeoorderpractice_recyclerview_20220809_0902.datas.StoreData

class DetailStoreActivity : BaseActivity() {

    lateinit var binding : ActivityDetailStoreBinding
    lateinit var storeData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_store)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        storeData = intent.getSerializableExtra("storeData") as StoreData

        binding.titleTxt.text = storeData.title
        Glide.with(mContext)
            .load(storeData.imageUri)
            .into(binding.storeImg)
        binding.titleTxt.text = storeData.title
        binding.scoreTxt.text = "(${storeData.score})"
        binding.scoreRatingBar.rating = storeData.score.toFloat()
        binding.phoneNumTxt.text = storeData.phoneNum
        binding.homepageTxt.text = storeData.siteUrl

    }






}