package com.rachael.whatsappclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab)

        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = MainPageAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
        when(position){
                 0 -> tab.icon = getDrawable(R.drawable.ic_baseline_photo_camera_24)
                 1 -> tab.text ="Chat"
                 2 -> tab.text ="Status"
                 3 -> tab.text ="calls"
             }
        }.attach()
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