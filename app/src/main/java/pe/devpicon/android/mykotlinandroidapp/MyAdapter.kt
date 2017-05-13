package pe.devpicon.android.mykotlinandroidapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by armando on 5/12/17.
 */
class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    lateinit var personModelList: List<PersonModel>

    override fun getItemCount(): Int {
        return personModelList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,
                parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPerson(personModelList.get(position))
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtItemName: TextView = itemView.findViewById(R.id.txt_item_name) as TextView
        var txtItemAge: TextView = itemView.findViewById(R.id.txt_item_age) as TextView

        fun bindPerson(value: PersonModel) {

            txtItemName.text = if (value.name != null) value.name else "Vacío"
            txtItemAge.text = value.age.toString()
        }
    }


}