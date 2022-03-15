package com.vangood.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.vangood.bmi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }
    private lateinit var binding :ActivityMainBinding
    //many fragment
    val fragments = mutableListOf<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//onCreate not yet enter view
        initFragment()
    }

    private fun initFragment() {
        fragments.add(0,BlankFragment())
        //val guess1to10Fragment = BlankFragment()
        /*val transaction =supportFragmentManager.beginTransaction()
            transaction.add(R.id.container,guess1to10Fragment)
            .commit()*/
        //Kotlin way
        //.run run run bye bye return = Int can not use
        //.apply return = Fragment bag.apply put tea coffee than to person
        supportFragmentManager.beginTransaction().apply {
            add(R.id.container,fragments[0])
            commit()
        }
    }

}