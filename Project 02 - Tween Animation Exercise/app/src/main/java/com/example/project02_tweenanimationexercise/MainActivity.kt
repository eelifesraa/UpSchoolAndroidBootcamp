package com.example.project02_tweenanimationexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.example.project02_tweenanimationexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anim=AnimationUtils.loadAnimation(this,R.anim.tweenanimation)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btnMagic.setOnClickListener {
            binding.imageView.startAnimation(anim)
        }

    }
}