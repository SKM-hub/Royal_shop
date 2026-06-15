package com.example.admin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.admin.databinding.ActivityAdminBinding

class AdminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminBinding
    private val productList = mutableListOf("Leather Bag", "Smart Watch")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText.text = "ROYAL ADMIN"
        binding.infoText.text = "Manage products and categories from here."

        binding.btnAddProduct.setOnClickListener {
            val name = binding.productNameInput.text.toString().trim()
            if (name.isNotEmpty()) {
                productList.add(name)
                Toast.makeText(this, "$name added", Toast.LENGTH_SHORT).show()
                binding.productNameInput.text?.clear()
            } else {
                Toast.makeText(this, "Enter a product name", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnRemoveProduct.setOnClickListener {
            if (productList.isNotEmpty()) {
                val removed = productList.removeAt(productList.lastIndex)
                Toast.makeText(this, "$removed removed", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No products to remove", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
