package com.example.cemera

import android.graphics.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ListView = findViewById<ListView>(R.id.listview)

        val listv = arrayListOf(
        DataClass(R.drawable.apples,"Deepak kumar","seen 4h ago"),
        DataClass(R.drawable.apples,"Rahul kumar","sent2h ago")

        )
val adapter = Adapter(this,listv)
      ListView.adapter = adapter



    }


}