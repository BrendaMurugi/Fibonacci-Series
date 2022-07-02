package dev.murugi.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.murugi.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displays()
    }
    fun displays(){
        var fibonacciList = fibonacci(100)
        var fibiAdapter = FibonacciRecyclerViewAdapter(fibonacciList)

        binding.rvFibonacci.layoutManager = LinearLayoutManager(this)
        binding.rvFibonacci.adapter = fibiAdapter
    }
    fun fibonacci(n: Int):List<Int> {
        var currentNumber = 0
        var prevNumber = 1

        var fibonacciList = ArrayList<Int>()
        var firstNumber = 0
        var secondNumber = 1
        var counter = 0
        while (counter<n){
            println(firstNumber)
            val sum = firstNumber + secondNumber
            firstNumber = secondNumber
            secondNumber = sum
            counter++
            fibonacciList += sum
        }

        return fibonacciList

    }
}