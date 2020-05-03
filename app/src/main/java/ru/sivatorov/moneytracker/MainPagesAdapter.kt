package ru.sivatorov.moneytracker

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

public class MainPagesAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val PAGE_EXPENSES: Int = 0
    private val PAGE_INCOMES: Int = 1
    private val PAGE_BALANCE: Int = 2

    lateinit var titles: Array<String>

    constructor(manager: FragmentManager, context: Context): this (manager) {
        titles = context.resources.getStringArray(R.array.tab_title)
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            PAGE_EXPENSES -> {
                return ItemsFragment.createItemsFragment(ItemsFragment.TYPE_EXPENSES)
            }
            PAGE_INCOMES -> {
                return ItemsFragment.createItemsFragment(ItemsFragment.TYPE_INCOMES)
            }
            PAGE_BALANCE -> {
                return ItemsFragment()
            }
            else -> {
                return ItemsFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}