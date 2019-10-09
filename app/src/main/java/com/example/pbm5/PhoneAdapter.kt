package com.example.pbm5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class PhoneAdapter (val phonelist: List<Phone>, val clickListener: (Phone) -> Unit):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_row, parent, false)

        return PhoneViewHolder(view)
    }

    override fun getItemCount(): Int = phonelist.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PhoneViewHolder).bind(phonelist[position], clickListener)
    }

    class PhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(phone: Phone, clickListener: (Phone) -> Unit) {
            itemView.contact_name.text = phone.name
            itemView.phone.text = phone.phone.toString()
            itemView.setOnClickListener { clickListener(phone) }
        }
    }
}