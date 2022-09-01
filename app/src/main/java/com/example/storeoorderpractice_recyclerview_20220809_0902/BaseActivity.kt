package com.example.storeoorderpractice_recyclerview_20220809_0902

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext : Context = this

    abstract fun setupEvents()

    abstract fun setValues()

}