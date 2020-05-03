package ru.sivatorov.moneytracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pager = findViewById<ViewPager>(R.id.viewPager)

        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        var adapter: MainPagesAdapter = MainPagesAdapter(supportFragmentManager, this)
        pager.adapter = adapter


        tabLayout.setupWithViewPager(pager)
    }
}
