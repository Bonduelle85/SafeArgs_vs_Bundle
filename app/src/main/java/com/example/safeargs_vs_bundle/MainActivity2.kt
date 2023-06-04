package com.example.safeargs_vs_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.safeargs_vs_bundle.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var _binding: ActivityMain2Binding
    val binding
        get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
//        val navController = Navigation.findNavController(this, R.id.fragmentContainerView)
//        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)
    }

}