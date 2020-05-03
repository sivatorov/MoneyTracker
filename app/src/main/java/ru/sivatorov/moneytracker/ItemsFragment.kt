package ru.sivatorov.moneytracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


public class ItemsFragment : Fragment() {
    lateinit var recycler: RecyclerView
    lateinit var list: List<items>


    companion object{
        const val TYPE_KEY: String = "type"
        const val TYPE_UNKNOWN: Int = -1
        const val TYPE_EXPENSES: Int = 1
        const val TYPE_INCOMES: Int = 2

        public fun createItemsFragment(type: Int) : ItemsFragment{
            var fragment: ItemsFragment = ItemsFragment()
            var bundle: Bundle = Bundle()
            bundle.putInt(ItemsFragment.TYPE_KEY, ItemsFragment.TYPE_EXPENSES)
            fragment.arguments = bundle
            return fragment
        }
    }




    private var type: Int = TYPE_EXPENSES

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bundle: Bundle = Bundle()
        bundle = this!!.arguments!!
        type = bundle.getInt(TYPE_KEY, TYPE_UNKNOWN)

        if(type == TYPE_UNKNOWN) {
            throw IllegalArgumentException("Unknown")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_items, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = createData()
        recycler = view.findViewById(R.id.list)
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = ItemsAdapter(list)
    }


    private fun createData(): List<items> {
        val values = arrayListOf<items>()
        values.add(items("Молоко", 35))
        values.add(items("Жизнь", 1))
        values.add(items("Курсы", 50))
        values.add(items("Хлеб", 26))
        values.add(
            items(
                "Тот самый ужин, который я оплатил за всех, потому что платид картой",
                600000
            )
        )
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