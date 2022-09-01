package com.example.storeoorderpractice_recyclerview_20220809_0902

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.storeoorderpractice_recyclerview_20220809_0902.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

//  onCreate 내부에는 필수적으로 작성해야 하는 것 외에는 비워준다
//  coz 생명주기 때문 함수로 묶어서 작업해야하는것에 익숙해져야 하므로
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
         }

//      모든 이벤트 처리를 여기서 할 거다
        override fun setupEvents() {

        }
//      모든 것의 초기화는 여기서 할 거다
        override fun setValues() {

        }



}