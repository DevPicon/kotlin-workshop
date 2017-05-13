package pe.devpicon.android.mykotlinandroidapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val myAdapter: MyAdapter by lazy { initializeAdapter() }
    val anotherList = listOf("otro elemento 1", "otro elemento 2", "otro elemento 3", "otro elemento 4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRecyclerView = findViewById(R.id.rv_recycler_view) as RecyclerView
        val myLayoutManager = LinearLayoutManager(this)

        myRecyclerView.layoutManager = myLayoutManager
        myRecyclerView.adapter = myAdapter
    }

    private fun initializeAdapter(): MyAdapter {
        return MyAdapter()
    }

    override fun onResume() {
        super.onResume()
        myAdapter.stringValues = anotherList
        myAdapter.notifyDataSetChanged()
    }

}


