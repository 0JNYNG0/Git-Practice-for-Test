package com.example.firstcloneapplication.util

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.firstcloneapplication.R
import com.example.firstcloneapplication.databinding.DialogCustomBinding
import com.example.firstcloneapplication.src.main.MainActivity

class CustomDialog(context: Context): Dialog(context) {
    private val dialog = Dialog(context)
    private lateinit var binding: DialogCustomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_custom)

        binding = DialogCustomBinding.inflate(layoutInflater)

        binding.dialogCustomBtnOk.setOnClickListener {
            if(binding.dialogCustomEditText.text.isNotEmpty()) {
                MainActivity().showCustomToast(binding.dialogCustomEditText.text.toString())
                dialog.dismiss()
            } else {
                MainActivity().showCustomToast("값을 입력해주세요.")
            }
        }
        binding.dialogCustomBtnCancel.setOnClickListener {
            dialog.dismiss()
        }
    }

    override fun show() {
        if(!this.isShowing) super.show()
    }
}