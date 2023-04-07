package com.example.ppb_comffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ppb_comffee.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val mHomeFragment = LoginFragment()
        val fragment = mFragmentManager.findFragmentByTag(LoginFragment::class.java.simpleName)

        if(fragment !is LoginFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + LoginFragment::class.java.simpleName)
            mFragmentManager.beginTransaction().add(R.id.container, mHomeFragment, LoginFragment::class.java.simpleName).commit()
        }
    }
}