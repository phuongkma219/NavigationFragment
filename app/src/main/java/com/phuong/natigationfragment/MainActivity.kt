package com.phuong.natigationfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.phuong.natigationfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var controller :NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding  = DataBindingUtil.setContentView(this,R.layout.activity_main)
        controller = findNavController(R.id.my_nav_host_fragment)
        val navHostFragment = supportFragmentManager
        binding.bottomNav.setupWithNavController(controller)
//        Navigation.findNavController(this,R.id.my_nav_host_fragment).navigate(R.id.homeFragment)
    }
    fun demo(){
        println("Ahaha")
    }
}