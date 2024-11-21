package com.example.ei11m5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.ei11m5.databinding.ActivityMainBinding
import com.example.ei11m5.ui.main.MainViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
