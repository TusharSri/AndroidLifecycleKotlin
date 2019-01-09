package com.example.apple.lifecycledemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Logger.getLogger(SecondActivity::class.java.name).warning("onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Logger.getLogger(SecondActivity::class.java.name).warning("onRestart")
    }

    override fun onStart() {
        super.onStart()
        Logger.getLogger(SecondActivity::class.java.name).warning("onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.getLogger(SecondActivity::class.java.name).warning("onResume")
    }

    override fun onStop() {
        super.onStop()
        Logger.getLogger(SecondActivity::class.java.name).warning("onStop")
    }

    override fun onPause() {
        super.onPause()
        Logger.getLogger(SecondActivity::class.java.name).warning("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.getLogger(SecondActivity::class.java.name).warning("onDestroy")
    }
}
