package com.example.firstcloneapplication.src.main.myPage

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.firstcloneapplication.R
import com.example.firstcloneapplication.config.BaseFragment
import com.example.firstcloneapplication.databinding.FragmentMyPageBinding
import com.example.firstcloneapplication.src.main.MainActivity
import com.example.firstcloneapplication.src.map.MapActivity

class MyPageFragment :
    BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::bind, R.layout.fragment_my_page){

    private var mCount = 0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showCustomToast("마이페이지 입니다.")

        binding.buttonChangeCounterText.setOnClickListener {
            //binding.textViewCounter.text = "${++mCount}번 눌렸습니다."
            startActivity(Intent(activity, MapActivity::class.java))
        }
    }
}