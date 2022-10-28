package com.example.firstcloneapplication.src.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstcloneapplication.R
import com.example.firstcloneapplication.config.BaseActivity
import com.example.firstcloneapplication.databinding.ActivityMainBinding
import com.example.firstcloneapplication.src.main.home.HomeFragment
import com.example.firstcloneapplication.src.main.movie.MovieFragment
import com.example.firstcloneapplication.src.main.myPage.MyPageFragment

class MainActivity: BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment())

        binding.mainBtmNav.run {
            setOnItemSelectedListener { item ->
                when(item.itemId) {
                    R.id.menu_main_btm_nav_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_my_page -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MyPageFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_movie -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MovieFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_main_btm_nav_home
        }
    }
}