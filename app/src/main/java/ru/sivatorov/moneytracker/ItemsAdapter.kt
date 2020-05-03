package ru.sivatorov.moneytracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(private val values: List<items>) :
    RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {


    override fun getItemCount() = values.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var items: items = values[position]
        holder.applyData(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
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
            title.text = items.getTitle()
            price.text = items.getPrice().toString() + " ₽"
        }
    }
}
