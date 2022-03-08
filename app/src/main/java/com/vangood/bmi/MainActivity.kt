package com.vangood.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.vangood.bmi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }
    private lateinit var binding :ActivityMainBinding
    val game = NumberGame()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun guess(view: View){
        Log.d(TAG, "test")
        val num = binding.editTextNumberDecimal.text.toString().toInt()
        AlertDialog.Builder(this)
            .setTitle("Guess")
            .setMessage(game.guess(num))
            .setPositiveButton("ok"){d,w ->
                if (game.end)game.resetgame()
                binding.tvCounter.text = game.counter.toString()
            }
            .show()
        binding.tvCounter.text = game.counter.toString()

    }
}