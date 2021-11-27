package uz.shakhzod.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the support action bar
        val actionBar = supportActionBar

        // Set the action bar title, subtitle and elevation
        actionBar!!.title = "Kotlin"
        actionBar.subtitle = "Android darslari"
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_cut -> {
                text_view.text = "Cut"
                return true
            }
            R.id.action_copy -> {
                text_view.text = "Copy"
                return true
            }
            R.id.action_paste -> {
                text_view.text = "Paste"
                return true
            }
            R.id.action_new -> {
                text_view.text = "New"
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}