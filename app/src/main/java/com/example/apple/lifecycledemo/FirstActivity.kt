package com.example.apple.lifecycledemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.util.logging.Logger

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Logger.getLogger(FirstActivity::class.java.name).warning("onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Logger.getLogger(FirstActivity::class.java.name).warning("onRestart")
    }

    override fun onStart() {
        super.onStart()
        Logger.getLogger(FirstActivity::class.java.name).warning("onStart")
    }

    override fun onResume() {
        super.onResume()
        Logger.getLogger(FirstActivity::class.java.name).warning("onResume")
    }

    override fun onPause() {
        super.onPause()
        Logger.getLogger(FirstActivity::class.java.name).warning("onPause")
    }

    override fun onStop() {
        super.onStop()
        Logger.getLogger(FirstActivity::class.java.name).warning("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.getLogger(FirstActivity::class.java.name).warning("onDestroy")
    }

    fun goToSecondActivity(view: View) {
        val secondActivity = Intent(applicationContext,SecondActivity::class.java)
        startActivity(secondActivity)
    }
}
