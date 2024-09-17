package com.unh.quizzlyplay

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unh.quizzlyplay.databinding.ActivityWelcome2Binding

class WelcomeActivity2 : AppCompatActivity() {



    lateinit var splashBinding: ActivityWelcome2Binding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        splashBinding = ActivityWelcome2Binding.inflate(layoutInflater)
        val view = splashBinding.root
//        setContentView
        setContentView(view)

    }
}