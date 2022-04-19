package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.TakjilAdapter

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Takjil>(
            Takjil(
                R.drawable.cendol,
                "Es Cendol",
                "Es Cendol merupakan takjil dalam bentuk minuman dingin yang berisi isian"
            ),
            Takjil(
                R.drawable.gorengan,
                "Gorengan",
                "Merupakan takjil yang paling diminati,karena banyak variannya. Mulai dari pisang goreng,Tahu goreng, Tempe goreng "
            ),
            Takjil(
                R.drawable.kelapa,
                "Es Kelapa Muda",
                "Es kelapa muda merupakan takjil yang terdiri dari kelapa muda, es, susu kental manis, dan juga gula cair"
            ),
            Takjil(
                R.drawable.sala,
                "Sala Lauauk",
                "Merupakan takjil yang termasuk kedalam jenis gorengan "
            ),
        )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_takjil)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = TakjilAdapter(this, superheroList){
            val intent = Intent(this,DetailTakjilActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}