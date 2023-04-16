package com.example.ppb_comffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val mWelcomeFragment = WelcomeFragment()
        val fragment = mFragmentManager.findFragmentByTag(WelcomeFragment::class.java.simpleName)

        if(fragment !is WelcomeFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + WelcomeFragment::class.java.simpleName)
            mFragmentManager.beginTransaction().add(R.id.frame_container, mWelcomeFragment, WelcomeFragment::class.java.simpleName).commit()
        }
    }
}