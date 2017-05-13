package pe.devpicon.android.mykotlinandroidapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by armando on 5/12/17.
 */
class MyAdapter(val stringValues: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return stringValues.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,
                parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindString(stringValues.get(position))
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtItem: TextView = itemView.findViewById(R.id.txt_item) as TextView

        fun bindString(value: String) {
            txtItem.text = value
        }
    }
}