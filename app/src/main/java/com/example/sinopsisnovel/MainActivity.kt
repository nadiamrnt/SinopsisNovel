package com.example.sinopsisnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){

    private lateinit var  novelView: RecyclerView
    private lateinit var novelAdapter: NovelAdapter
    private var list: ArrayList<Novel> = arrayListOf()
    private var title: String = "Sinopsis Novel"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        novelView = findViewById(R.id.list_novel)
        novelView.setHasFixedSize(true)

        list.addAll(ListNovel.listData)
        showRecyclerCardView()

    }

    private fun showRecyclerCardView() {
        novelView.layoutManager = LinearLayoutManager(this)
        novelAdapter = NovelAdapter(list)
        novelView.adapter = novelAdapter

        novelAdapter.setOnItemClickCallback(object : NovelAdapter.OnItemClickCallback {
            override fun onItemClicked(novel: Novel) {
                val detailIntent = Intent(this@MainActivity, NovelDetail::class.java)

                detailIntent.putExtra(NovelDetail.DTL_IMAGE, novel.image)
                detailIntent.putExtra(NovelDetail.DTL_TITLE, novel.title)
                detailIntent.putExtra(NovelDetail.DTL_AUTHOR, novel.author)
                detailIntent.putExtra(NovelDetail.DTL_TEXT, novel.detail)

                startActivity(detailIntent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.action_cardview -> {
                title = "Sinopsis Novel"
                showRecyclerCardView()
            }
            R.id.action_about -> {
                title = "About Me"
                val moveIntent = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(moveIntent)
            }
        }
    }
}