package com.example.cemera

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(val context: Context, val listaray: ArrayList<DataClass>) : BaseAdapter() {
    override fun getCount(): Int {
        return listaray.size
    }

    override fun getItem(p0: Int): Any {
        return listaray[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layout = LayoutInflater.from(context).inflate(R.layout.listvi, null, false)

        val image = layout.findViewById<ImageView>(R.id.image1)
        val name = layout.findViewById<TextView>(R.id.name1)
        val time = layout.findViewById<TextView>(R.id.time1)

        image.setImageResource(listaray[p0].image)
        name.text= listaray[p0].name
        time.text = listaray[p0].settime

        return layout

    }

}


