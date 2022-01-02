package com.example.sinopsisnovel

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.zip.Inflater

class NovelAdapter (private val listNovel: ArrayList<Novel>) : RecyclerView.Adapter<NovelAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var novelImg: ImageView = itemView.findViewById(R.id.novel_img)
        var novelTitle: TextView = itemView.findViewById(R.id.novel_title)
        var novelAuthor: TextView = itemView.findViewById(R.id.novel_author)
        var novelDetail: TextView = itemView.findViewById(R.id.novel_detail)
        var btnFav: Button = itemView.findViewById(R.id.btn_fav)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: NovelAdapter.CardViewViewHolder, position: Int) {
        val novel = listNovel[position]

        Glide.with(holder.itemView.context)
            .load(novel.image)
            .apply(RequestOptions().override(80,120))
            .into(holder.novelImg)
        holder.novelTitle.text = novel.title
        holder.novelAuthor.text = novel.author
        holder.novelDetail.text = novel.detail
        holder.btnFav.setOnClickListener{
            Toast.makeText(holder.itemView.context, listNovel[holder.adapterPosition].title + " Disukai", Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(novel)
        }
    }

    override fun getItemCount(): Int {
        return listNovel.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(novel: Novel)
    }
}