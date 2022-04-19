package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailTakjilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_takjil)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val takjil = intent.getParcelableExtra<Takjil>(MainActivity.INTENT_PARCELABLE)

        val imgTakjil = findViewById<ImageView>(R.id.img_item_photo)
        val nameTakjil = findViewById<TextView>(R.id.tv_item_name)
        val descTakjil = findViewById<TextView>(R.id.tv_item_description)

        imgTakjil.setImageResource(takjil?.imgTakjil!!)
        nameTakjil.text = takjil.nameTakjil
        descTakjil.text = takjil.descriptionTakjil
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}