package com.example.kotlinimapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        inits()
    }

    open fun inits(){
        //初始化一些公共的功能，比如说摇一摇，子类也可以覆写该方法，完成自己的初始化


    }

    //子类必须实现方法返回一个布局资源的ID
    abstract fun getLayoutResId(): Int


}