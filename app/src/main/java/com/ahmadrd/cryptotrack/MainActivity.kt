package com.ahmadrd.cryptotrack

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.ahmadrd.cryptotrack.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val activeIndicatorColor = Color.TRANSPARENT
        val colorStateList = ColorStateList.valueOf(activeIndicatorColor)
        navView.itemActiveIndicatorColor = colorStateList

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.
            nav_host_fragment_activity_main) as? NavHostFragment
                ?: throw IllegalStateException("NavHostFragment not found")
        val navController = navHostFragment.navController
        navView.setupWithNavController(navController)
    }
}