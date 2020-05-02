package ru.sivatorov.moneytracker

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

public var TAG: String = "ZvthH"
class ItemListActivity : AppCompatActivity() {

//    public var mData: List<Record> = createData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itemslist)
        var mData: List<Record> = createData()
        val mRecyclerView: RecyclerView = findViewById(R.id.list)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = ItemListAdapter(mData)


    }

    private fun createData(): List<Record> {
        val values = arrayListOf<Record>()
        values.add(Record("Молоко", 35))
        values.add(Record("Жизнь", 1))
        values.add(Record("Курсы", 50))
        values.add(Record("Хлеб", 26))
        values.add(Record("Тот самый ужин, который я оплатил за всех, потому что платид картой", 600000))
        values.add(Record("", 20))
        values.add(Record("Тот самый ужин", 604))
        values.add(Record("Ракета Falcon Руфмн", 1))
        values.add(Record("Лего Тысячелетний Сокол", 100000))
        values.add(Record("MacBook Pro", 100))
        values.add(Record("Шоколадка", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        values.add(Record("Шкаф", 100))
        return values
    }



    class ItemListAdapter(private val values: List<Record>) :
        RecyclerView.Adapter<ItemListAdapter.RecordViewHolder>() {
        override fun getItemCount() = values.size

        override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
            Log.i(TAG, "onBindViewHolder " + position)
//            holder?.price?.text = values[position].toString()
            var record: Record = values[position]
            holder.applyData(record)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder {
            Log.i(TAG, "onCreateViewHolder")
                    return RecordViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_record, parent,false))
        }

        class RecordViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//            var textView: TextView? = null
//            init {
//                textView = itemView?.findViewById(R.id.list)
//            }
            var title = itemView.findViewById<TextView>(R.id.title)
            var price = itemView.findViewById<TextView>(R.id.price)

            public fun applyData(record: Record) {
                Log.i(TAG, record.getTitle())
                title.text = record.getTitle()
                price.text = record.getPrice().toString()
            }

//            val title = itemView.title
//            val price = itemView.price
        }

    }

}



