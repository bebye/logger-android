package com.bebye.logger.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bebye.logger.log.Logger
import com.bebye.logger.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.d("dkdk")
    }
}