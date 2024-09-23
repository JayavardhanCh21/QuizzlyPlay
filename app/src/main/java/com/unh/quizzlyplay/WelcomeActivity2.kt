package com.unh.quizzlyplay

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.animation.AnimationUtils
import com.unh.quizzlyplay.databinding.ActivityWelcome2Binding

class WelcomeActivity2 : AppCompatActivity() {



    lateinit var splashBinding: ActivityWelcome2Binding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        splashBinding = ActivityWelcome2Binding.inflate(layoutInflater)
        val view = splashBinding.root
        setContentView(view)


        val alphaAnimation = android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.splash_anim)
        splashBinding.textViewSplash.startAnimation(alphaAnimation)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(object : Runnable{
            override fun run() {
                val intent = Intent(this@WelcomeActivity2, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        },5000)



    }
}