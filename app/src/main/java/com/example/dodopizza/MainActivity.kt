package com.example.dodopizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dodopizza.adapter.PizzaAdapter
import com.example.dodopizza.databinding.ActivityMainBinding
import androidx.core.widget.addTextChangedListener
import com.example.dodopizza.model.Pizza
import com.example.dodopizza.model.PizzaDataSource


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PizzaAdapter(
            onPizzaClick = {
                handlePizzaClick(it)
            }
        )

        binding.recycleView.adapter = adapter

        adapter.setData(PizzaDataSource.pizzaList)

        binding.editText.addTextChangedListener {
            val searchQuery = it.toString().lowercase()

            if (searchQuery.isEmpty()){
                adapter?.setData(PizzaDataSource.pizzaList)
            } else {
                val list = PizzaDataSource.pizzaList.filter {
                    it.title.lowercase().contains(searchQuery)
                }
                adapter?.setData(ArrayList(list))
            }
        }
    }





    private fun handlePizzaClick(pizza: Pizza) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("pizza", pizza)
        startActivity(intent)
    }

}

