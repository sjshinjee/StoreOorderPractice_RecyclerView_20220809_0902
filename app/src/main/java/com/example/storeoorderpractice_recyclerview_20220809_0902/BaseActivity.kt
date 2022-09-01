package com.example.storeoorderpractice_recyclerview_20220809_0902

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

//코틀린은 오직 open/추상 클래스만 상속가능
//AppCom~클래스를 상속받아야 생명주기함수들과 액티비티들로서 활동 가능
abstract class BaseActivity : AppCompatActivity() {

    val mContext : Context = this

//  추상함수는 오직 추상/오픈 클래스 에서만 생성
    abstract fun setupEvents()

    abstract fun setValues()

}