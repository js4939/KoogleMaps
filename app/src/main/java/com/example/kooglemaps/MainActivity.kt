package com.example.kooglemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kooglemaps.databinding.ActivityMainBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var data:HashMap<String,spotData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()

        var dbCon = dbController() //dbController
        data = dbCon.getData()
    }

    fun initLayout(){
        binding.loginBtn.setOnClickListener {

        }
        binding.registerBtn.setOnClickListener {

        }
    }
}