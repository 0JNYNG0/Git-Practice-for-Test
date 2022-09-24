package com.example.firstcloneapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstcloneapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bundle:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bundle = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bundle.root)
    }
}