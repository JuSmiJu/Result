package com.example.result


import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.result.R

class Adapter(private val fio: MutableList<String>, private val dolg: MutableList<String>,
              private val stat: MutableList<Boolean>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {


    override fun getItemCount() = fio.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rabotniki, parent, false)
        return MyViewHolder(itemView)
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.largeTextView?.text = fio[position]
        holder.smallTextView?.text = "Должность: " + dolg[position]
        if (stat[position] == true) {
            holder.res_of_view?.setColorFilter(Color.argb(255, 93, 203, 154))
        } else {
            holder.res_of_view?.setColorFilter(Color.argb(255, 220, 73, 55))
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var largeTextView: TextView? = null
        var smallTextView: TextView? = null
        var res_of_view: ImageView? = null

        init {
            largeTextView = itemView.findViewById(R.id.textViewLarge)
            smallTextView = itemView.findViewById(R.id.textViewSmall)
            res_of_view = itemView.findViewById(R.id.ris_of)
        }
    }
}