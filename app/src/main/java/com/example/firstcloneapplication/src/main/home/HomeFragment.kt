package com.example.firstcloneapplication.src.main.home

import android.os.Bundle
import android.view.View
import com.example.firstcloneapplication.R
import com.example.firstcloneapplication.config.BaseFragment
import com.example.firstcloneapplication.databinding.FragmentHomeBinding
import com.example.firstcloneapplication.util.CustomDialog

class HomeFragment: BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::bind, R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showCustomToast("홈 화면입니다.")

        binding.homeBtnShowDialog.setOnClickListener {
            val dialog = CustomDialog(requireContext())
            dialog.show()
        }
    }
}