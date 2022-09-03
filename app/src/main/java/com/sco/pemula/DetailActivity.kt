package com.sco.pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.sco.pemula.source.Item
import com.sco.pemula.source.ItemData

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra("EXTRA_ID", 0)

        var image : ImageView = findViewById(R.id.detailItemPhoto)
        var name : TextView = findViewById(R.id.detailName)
        var text : TextView = findViewById(R.id.detailText)
        var detail : TextView = findViewById(R.id.detailItem)

        var curentItemData: Item = ItemData.getItemInformationById(id)

        image.setImageResource(curentItemData.photo)
        text.text = curentItemData.text
        name.text = curentItemData.name
        detail.text = curentItemData.detail

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = curentItemData.name
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}