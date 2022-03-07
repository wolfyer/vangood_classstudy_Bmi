package com.vangood.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.vangood.bmi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
    }

    fun guess(view: View){
        println("Hahahahahahha!")
    }
}