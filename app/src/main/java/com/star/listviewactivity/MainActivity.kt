package com.star.listviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var listAdapter: ListAdapter
        lateinit var list: ListView
        var arrayList : ArrayList<NewListView> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listAdapter = ListAdapter(arrayList)
        list = findViewById(R.id.list)
        list.adapter = listAdapter
        arrayList.add(NewListView(1,"Sukh"))
        arrayList.add(NewListView(2,"Aman"))
        arrayList.add(NewListView(3,"Manreet"))


    }
}