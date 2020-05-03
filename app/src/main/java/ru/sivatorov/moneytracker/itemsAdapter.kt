package ru.sivatorov.moneytracker

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemsAdapter(private val values: List<items>) :
    RecyclerView.Adapter<itemsAdapter.ItemViewHolder>() {


    override fun getItemCount() = values.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        Log.i(TAG, "onBindViewHolder " + position)
        var items: items = values[position]
        holder.applyData(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        Log.i(TAG, "onCreateViewHolder")
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_record, parent, false
            )
        )
    }

    public inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.title)
        var price = itemView.findViewById<TextView>(R.id.price)

        public fun applyData(items: items) {
            Log.i(TAG, items.getTitle())

            title.text = items.getTitle()
            price.text = items.getPrice().toString() + " ₽"
        }
    }
}
