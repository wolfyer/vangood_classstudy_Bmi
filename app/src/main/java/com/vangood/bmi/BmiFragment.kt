package com.vangood.bmi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.vangood.bmi.databinding.FragmentBmiBinding


class BmiFragment : Fragment() {
    lateinit var binding: FragmentBmiBinding
    //val viewModel by viewModels<> {  }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBmiBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bBmi.setOnClickListener {
            val weight = binding.edWeight.text.toString().toFloat()
            val height = binding.edHeight.text.toString().toFloat()
            var bmi = weight/(height*height)
            binding.tvBmi.setText("your bmi is $bmi")
            AlertDialog.Builder(requireContext())
                .setTitle("Hello")
                .setMessage("Your BMI is $bmi")
                .setPositiveButton("OK") { dialog, which ->
                    binding.edWeight.setText("")
                    binding.edHeight.setText("")
                }.show()

        }


    }
}