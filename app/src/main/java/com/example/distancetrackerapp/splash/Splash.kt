package com.example.distancetrackerapp.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.distancetrackerapp.R
import com.example.distancetrackerapp.ui.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        // Sử dụng Handler để chờ một khoảng thời gian và sau đó mở Activity mới
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }

    companion object {
        private const val SPLASH_TIME_OUT: Long = 2000 // Thời gian chờ (2 giây)
    }
}