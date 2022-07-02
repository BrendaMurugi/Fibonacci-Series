package dev.murugi.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciRecyclerViewAdapter(var fibonacciList: List<Int>) :
    RecyclerView.Adapter<FibonacciViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_list_item, parent, false)
        return FibonacciViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        holder.tvNumbers.text = fibonacciList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}
class FibonacciViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}