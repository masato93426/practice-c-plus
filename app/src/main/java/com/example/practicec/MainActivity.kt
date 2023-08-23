package com.example.practicec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practicec.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = getMessage("Masato")
    }

    /**
     * A native method that is implemented by the 'practicec' native library,
     * which is packaged with this application.
     */
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