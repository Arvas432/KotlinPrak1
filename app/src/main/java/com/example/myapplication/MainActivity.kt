package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        val fragmentManager = supportFragmentManager
        setContentView(view)
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentcontainer, FirstFragment.newInstance("",""))
        transaction.addToBackStack(null)
        transaction.commit()
        binding.servicesbutton.setOnClickListener {
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentcontainer, SecondFragment.newInstance("",""))
            transaction.addToBackStack(null)
            transaction.commit()

        }


    }
}