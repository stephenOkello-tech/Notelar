package com.notelar.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.notelar.R

class HomeActivity : AppCompatActivity() {

    private lateinit var bottom_app_bar : BottomAppBar
    private lateinit var notes_recyclerview : RecyclerView
    private lateinit var add_fab : FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()

        bottom_app_bar.setOnMenuItemClickListener{menuItem ->
            when(menuItem.itemId){
                R.id.lists -> {
                    Toast.makeText(this, "listings", Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }


    }

    private fun init(){
        bottom_app_bar = findViewById(R.id.bottom_app_bar)
        notes_recyclerview = findViewById(R.id.notes_recyclerview)
        add_fab = findViewById(R.id.add_fab)
    }


}