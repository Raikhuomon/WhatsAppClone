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
                goToNewGroupActivity2()
                return true
            }
            R.id.Linked_devices -> {
                goToNewGroupActivity3()
                return true
            }
            R.id.starred_messages -> {
                goToNewGroupActivity4()
                return true
            }
            R.id.settings -> {
            goToNewGroupActivity5()
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
    private fun goToNewGroupActivity2(){
        val i = Intent(this, NewGroupActivity2::class.java)
        startActivity(i)
    }
    private fun goToNewGroupActivity3(){
        val i = Intent(this, NewGroupActivity3::class.java)
        startActivity(i)
    }
    private fun goToNewGroupActivity4(){
        val i = Intent(this, NewGroupActivity4::class.java)
        startActivity(i)
    }
    private fun goToNewGroupActivity5(){
        val i = Intent(this, NewGroupActivity5::class.java)
        startActivity(i)
    }
}