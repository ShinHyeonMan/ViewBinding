package com.cswsshm0627.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cswsshm0627.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView1.setOnClickListener {

        }

        binding.textView2.setOnClickListener {

        }

        binding.textView3.setOnClickListener {

        }
    }
}
