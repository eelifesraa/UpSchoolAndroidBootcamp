package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding
    //private lateinit var SigninBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //setContentView(R.layout.activity_start)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_start)
       // binding.SigninBtn=findViewById(R.id.SigninBtn)

        binding.SigninBtn.setOnClickListener {
            val intent= Intent(this@StartActivity,PremiumActivity::class.java)
            startActivity(intent)
        }
    }
}