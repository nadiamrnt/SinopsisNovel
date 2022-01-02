package com.example.sinopsisnovel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class NovelDetail : AppCompatActivity() {

    companion object{
        const val DTL_IMAGE = "dtl_image"
        const val DTL_TITLE = "dtl_title"
        const val DTL_AUTHOR = "dtl_author"
        const val DTL_DETAIL = "dtl_detail"
        const val DTL_TEXT = "dtl_text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novel_detail)

        getDetail()
    }

    private fun getDetail() {
        val dtlImage: ImageView = findViewById(R.id.dtl_img)
        val dtlTitle: TextView = findViewById(R.id.dtl_title)
        val dtlAuthor: TextView = findViewById(R.id.dtl_author)
        val dtlText: TextView = findViewById(R.id.dtl_text)
        val dtlLayout: View = findViewById(R.id.layout_detail)

        val image = intent.getIntExtra(DTL_IMAGE, 0)
        val title = intent.getStringExtra(DTL_TITLE)
        val author = intent.getStringExtra(DTL_AUTHOR)
        val text = intent.getStringExtra(DTL_TEXT)

        dtlTitle.text = title
        dtlAuthor.text = author
        dtlText.text = text

        Glide.with(dtlLayout)
            .load(image)
            .into(dtlImage)
    }
}