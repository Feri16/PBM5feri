package com.example.pbm5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.phone_detail.*

class PhoneDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phone_detail)

        val intent = getIntent()
        if(intent.hasExtra(Intent.EXTRA_TEXT)){
            val partid = intent.getStringExtra(Intent.EXTRA_TEXT)
            detail_phone_number.text = partid
        }
    }
}
