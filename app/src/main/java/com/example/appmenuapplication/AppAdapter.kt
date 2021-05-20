package com.example.appmenuapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppAdapter(private val context: Context, private val appList: List<App>) :
    RecyclerView.Adapter<AppAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.app_bg)
        val name: TextView = view.findViewById(R.id.app_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_app, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
//            val index = viewHolder.adapterPosition
//            val fruit = appList[index]
//            val intent = Intent(context, FruitActivity::class.java).apply {
//                putExtra(FruitActivity.FRUIT_NAME, fruit.name)
//                putExtra(FruitActivity.FRUIT_IMG_ID, fruit.imgId)
//            }
//            context.startActivity(intent)
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val app = appList[position]
        holder.img.setImageResource(app.AppImg)
        holder.name.text=app.AppName
    }

    override fun getItemCount() = appList.size
}