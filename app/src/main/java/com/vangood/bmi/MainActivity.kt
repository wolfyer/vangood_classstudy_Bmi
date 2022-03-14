package com.vangood.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.vangood.bmi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }
    private lateinit var binding :ActivityMainBinding
    val viewModel by viewModels<GuessViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.counter.observe(this){
            binding.tvCounter.setText(it.toString())
        }
        viewModel.gameState.observe(this){
            state ->
            val message = when(state){
                GuessViewModel.GameState.BIGGER -> "BIGGER"
                GuessViewModel.GameState.SMALLER-> "SMALLER"
                GuessViewModel.GameState.BINGO -> "BINGO"
                GuessViewModel.GameState.INIT -> "START"
                else -> "something wrong"

            }
            AlertDialog.Builder(this)
                .setTitle("Guess")
                .setMessage(message)
                .setPositiveButton("ok"){d,w ->
                    if (state == GuessViewModel.GameState.BINGO)
                    viewModel.reset()
                }
                .show()
        }
    }

    fun guess(view: View){
        Log.d(TAG, "test")
        val num = binding.editTextNumberDecimal.text.toString().toInt()
        viewModel.guess(num)
    }

}