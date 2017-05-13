package pe.devpicon.android.mykotlinandroidapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val stringValues = listOf("Element 1","Element 2","Element 3","Element 4","Element 5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRecyclerView = findViewById(R.id.rv_recycler_view) as RecyclerView
        val myAdapter = MyAdapter(stringValues)
        val myLayoutManager = LinearLayoutManager(this)

        myRecyclerView.layoutManager = myLayoutManager
        myRecyclerView.adapter = myAdapter
    }

}


