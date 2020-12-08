package com.bebye.logger.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bebye.logger.log.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.v("This is Logger.")
        Logger.d("This is Logger.")
        Logger.i("This is Logger.")
        Logger.w("This is Logger.")
        Logger.e("This is Logger.")
        Logger.a("This is Logger.")
    }

}