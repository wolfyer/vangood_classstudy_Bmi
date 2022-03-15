package com.vangood.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        initFragments()
        binding.bottomNavBar.setOnItemSelectedListener {
            item ->
            when(item.itemId){
                R.id.acion_guess ->{
                    supportFragmentManager.beginTransaction().run {
                        replace(R.id.container,fragments[0])
                        commit()
                        true
                    }
                }
                R.id.action_camera ->{true}
                R.id.action_bmi ->{
                    supportFragmentManager.beginTransaction().run {
                        replace(R.id.container,fragments[1])
                        commit()
                        true
                    }
                }else ->true

            }
        }
    }

    private fun initFragments() {
        fragments.add(0,GuessFragment())
        fragments.add(1,BmiFragment())
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