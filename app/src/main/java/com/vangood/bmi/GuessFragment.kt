package com.vangood.bmi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

import com.vangood.bmi.databinding.FragmentGuessBinding

class GuessFragment  :Fragment(){
    lateinit var binding :FragmentGuessBinding
    val viewModel by viewModels<GuessViewModel> ()
    companion object{
        val TAG = GuessFragment::class.java.simpleName
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGuessBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val num = binding.number.text.toString().toInt()
            viewModel.guess(num)
        }
        viewModel.counter.observe(viewLifecycleOwner){
            binding.tvCounter.setText(it.toString())

        }
        viewModel.gameState.observe(viewLifecycleOwner){
            state ->
            val message = when(state){
                GuessViewModel.GameState.BIGGER -> "BIGGER"
                GuessViewModel.GameState.SMALLER-> "SMALLER"
                GuessViewModel.GameState.BINGO -> "BINGO"
                GuessViewModel.GameState.INIT -> "START"
                else -> "something wrong"

            }
            AlertDialog.Builder(requireContext())
                .setTitle("Guess")
                .setMessage(message)
                .setPositiveButton("ok"){d,w ->
                    if (state == GuessViewModel.GameState.BINGO)
                        viewModel.reset()
                }
                .show()
            Log.d(TAG, "onViewCreated: ")
        }

    }
}