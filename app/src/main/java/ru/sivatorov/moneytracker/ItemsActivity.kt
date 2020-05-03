package ru.sivatorov.moneytracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itemslist)
        var list: List<items> = createData()
        val recycler: RecyclerView = findViewById(R.id.list)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = itemsAdapter(list)
    }

    private fun createData(): List<items> {
        val values = arrayListOf<items>()
        values.add(items("Молоко", 35))
        values.add(items("Жизнь", 1))
        values.add(items("Курсы", 50))
        values.add(items("Хлеб", 26))
        values.add(items("Тот самый ужин, который я оплатил за всех, потому что платид картой", 600000))
        values.add(items("", 20))
        values.add(items("Тот самый ужин", 604))
        values.add(items("Ракета Falcon Руфмн", 1))
        values.add(items("Лего Тысячелетний Сокол", 100000))
        values.add(items("MacBook Pro", 100))
        values.add(items("Шоколадка", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        values.add(items("Шкаф", 100))
        return values
    }
}



