package com.example.sinopsisnovel

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AboutPage : AppCompatActivity(), View.OnClickListener {

    private var title: String = "About Me"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)
        setActionBarTitle(title)

        val btnLinkedIn: Button = findViewById(R.id.linked_in)
        btnLinkedIn.setOnClickListener(this)
        val btnInstagram: Button = findViewById(R.id.instagram)
        btnInstagram.setOnClickListener(this)
        val btnGithub: Button = findViewById(R.id.github)
        btnGithub.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.linked_in -> {
                val link = "https://www.linkedin.com/in/nadia-miranti-773206155/"
                val generateLink = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(generateLink)
            }
            R.id.instagram -> {
                val link = "https://www.instagram.com/nadiamrnt"
                val generateLink = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(generateLink)
            }
            R.id.github -> {
                val link = "https://github.com/nadiamrnt"
                val generateLink = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(generateLink)
            }
        }
    }
}