package com.example.shoppingapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText.text = "ROYAL SHOP"
        binding.welcomeText.text = "Shop fashion, electronics, and essentials."

        binding.btnFashion.setOnClickListener {
            Toast.makeText(this, "Fashion category selected", Toast.LENGTH_SHORT).show()
        }

        binding.btnElectronics.setOnClickListener {
            Toast.makeText(this, "Electronics category selected", Toast.LENGTH_SHORT).show()
        }

        binding.btnCart.setOnClickListener {
            Toast.makeText(this, "Cart opened", Toast.LENGTH_SHORT).show()
        }
    }
}
