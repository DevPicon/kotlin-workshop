package pe.devpicon.android.mykotlinandroidapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity(), MainView {

    val myAdapter: MyAdapter by lazy { initializeAdapter() }
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRecyclerView = findViewById(R.id.rv_recycler_view) as RecyclerView
        val myLayoutManager = LinearLayoutManager(this)

        myRecyclerView.layoutManager = myLayoutManager
        myRecyclerView.adapter = myAdapter

        presenter = MainPresenter(this)
    }

    private fun initializeAdapter(): MyAdapter = MyAdapter()

    override fun onResume() {
        super.onResume()

        presenter.loadElements()
    }

    override fun showElements(anotherList: List<String>) {
        myAdapter.stringValues = anotherList
        myAdapter.notifyDataSetChanged()
    }
}


