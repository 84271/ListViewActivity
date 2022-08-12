package com.star.listviewactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(var arrayList: ArrayList<NewListView>,
var clickInterface: ClickInterface) : BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return 3
    }

    override fun getItemId(p0: Int): Long {
        return 3
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var initView = LayoutInflater.from(p2?.context).inflate(R.layout.newlayout, p2, false)
        var tvName = initView.findViewById<TextView>(R.id.tvname)
        var tvid = initView.findViewById<TextView>(R.id.tvid)
        tvid.setText(arrayList[p0].id.toString())
        tvName.setText(arrayList[p0].name.toString())
        tvName.setOnClickListener {
            clickInterface.OnNameClicked(arrayList[p0].name ?: "")
        }
        return initView
    }
}