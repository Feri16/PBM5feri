package com.example.pbm5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listdata.layoutManager = LinearLayoutManager(this)
        listdata.setHasFixedSize(true)
        val data = createPhoneData()
        listdata.adapter = PhoneAdapter(data, {phoneItem: Phone -> phoneItem(phoneItem)})
    }

    private fun phoneItem(phone: Phone){
        val showDetail = Intent(this, PhoneDetail::class.java)
        showDetail.putExtra(Intent.EXTRA_TEXT, phone.phone.toString())
        startActivity(showDetail)
    }

    private fun createPhoneData() : List<Phone>{
        val listdata = ArrayList<Phone>()
        listdata.add(Phone(12738, "Xiaomi"))
        listdata.add(Phone(93756, "Redmi"))
        listdata.add(Phone(83647, "Pocopon"))
        return listdata
    }
}
