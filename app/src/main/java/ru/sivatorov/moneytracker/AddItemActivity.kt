package ru.sivatorov.moneytracker

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_additem.*


class AddItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_additem)

        setTitle(R.string.add_item_title)

        var name: EditText = findViewById(R.id.name)
        var price: EditText = findViewById(R.id.price)
        var addBtn: Button = findViewById(R.id.add_btn)

        name.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun afterTextChanged(s: Editable?) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                addBtn.isEnabled = !TextUtils.isEmpty(s)
            }
        })
    }

    fun onClick(view: View) {
        var name: String = name.text.toString()
        var price: String = price.text.toString()
    }
}
