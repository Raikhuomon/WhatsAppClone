package com.rachael.whatsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewGroupActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)

        recyclerview = findViewById(R.id.listOfFriends)
        recyclerview.adapter = listOfFriendsAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this)

        //adding line decoration
        val decor = DividerItemDecoration(this, RecyclerView.VERTICAL)
        recyclerview.addItemDecoration(decor)
    }
}