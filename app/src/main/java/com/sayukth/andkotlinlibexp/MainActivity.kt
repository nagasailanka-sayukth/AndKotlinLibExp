package com.sayukth.andkotlinlibexp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sayukth.andkotlinlibexp.databinding.ActivityMainBinding
import com.sayukth.utilslibrary.SayukthUtils

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}