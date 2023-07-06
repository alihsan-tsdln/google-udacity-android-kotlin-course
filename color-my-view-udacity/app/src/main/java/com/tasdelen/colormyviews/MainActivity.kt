package com.tasdelen.colormyviews

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tasdelen.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val clickable_texts : List<View> = listOf(binding.boxOne,
        binding.boxTwo, binding.boxThree, binding.boxFour,
        binding.boxFive, binding.constrains, binding.redBtn,
        binding.yellowBtn, binding.greenBtn)

        for(i in clickable_texts){
            i.setOnClickListener{makeColorized(it)}
        }
    }

    private fun makeColorized(view : View){
        when(view.id){
            binding.boxOne.id -> view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwo.id -> view.setBackgroundColor(Color.GRAY)
            binding.boxThree.id -> view.setBackgroundColor(Color.GREEN)
            binding.boxFour.id -> view.setBackgroundColor(Color.BLUE)
            binding.boxFive.id -> view.setBackgroundColor(Color.GREEN)

            binding.redBtn.id -> binding.boxThree.setBackgroundColor(Color.RED)
            binding.yellowBtn.id -> binding.boxFour.setBackgroundColor(Color.YELLOW)
            binding.greenBtn.id -> binding.boxFive.setBackgroundColor(Color.GREEN)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}