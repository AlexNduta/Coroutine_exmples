package com.example.coroutineexmples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1= findViewById<Button>(R.id.btMain)
        val btn2 = findViewById<Button>(R.id.btBackground)

        btn1.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                Log.i("Main", "Iam running on the main thread")  }


        }


        btn2.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                Log.i("Background", "Iam running on the background")
            }

        }
    }
}