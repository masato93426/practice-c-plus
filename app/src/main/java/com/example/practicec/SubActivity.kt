package com.example.practicec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }


    external fun stringFromJNI(): String

    external fun getMessage(msg: String): String

    companion object {
        // Used to load the 'practicec' library on application startup.
        init {
            System.loadLibrary("practicec")
            System.loadLibrary("sample")
        }
    }
}