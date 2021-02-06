package com.example.notes.olshanov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // получаем navController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }
}