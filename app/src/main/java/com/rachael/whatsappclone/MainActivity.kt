package com.rachael.whatsappclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> {
                Toast.makeText(this, "search click", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.new_group -> {
                goToNewGroupActivity()
                return true
            }
            R.id.new_broadcast -> {
                goToNewBroadcastActivity()
                return true
            }
            R.id.Linked_devices -> {
                goToLinkedDevicesActivity()
                return true
            }
            R.id.starred_messages -> {
                goToStarredMessagesActivity()
                return true
            }
            R.id.settings -> {
            goToSettingsActivity()
                return true
            }
            else -> {
                return false
            }
        }
    }
    private fun goToNewGroupActivity(){
        val i = Intent(this, NewGroupActivity::class.java)
        startActivity(i)
    }
    private fun goToNewBroadcastActivity(){
        val i = Intent(this, NewBroadcastActivity::class.java)
        startActivity(i)
    }
    private fun goToLinkedDevicesActivity(){
        val i = Intent(this, LinkedDevicesActivity::class.java)
        startActivity(i)
    }
    private fun goToStarredMessagesActivity(){
        val i = Intent(this, StarredMessagesActivity::class.java)
        startActivity(i)
    }
    private fun goToSettingsActivity(){
        val i = Intent(this, SettingsActivity::class.java)
        startActivity(i)
    }
}