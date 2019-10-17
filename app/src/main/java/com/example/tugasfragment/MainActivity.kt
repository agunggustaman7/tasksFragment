package com.example.tugasfragment

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var menu : Menu = btm_navigation.menu
        selectedMenu(menu.getItem(0))
        btm_navigation.setOnNavigationItemSelectedListener {
                item: MenuItem ->  selectedMenu(item)

            false
        }

    }

    private fun selectedMenu(item : MenuItem) {
        item.isChecked = true
        when(item.itemId) {
            R.id.ithome -> selectedFragment(fragment_home.getInstance())
            R.id.itcall -> selectedFragment(fragment_call.getInstance())
            R.id.itprofile -> selectedFragment(fragment_profile.getInstance())
        }
    }

    fun selectedFragment(fragment: Fragment) {
        var transaction : FragmentTransaction? = supportFragmentManager.beginTransaction()
        transaction?.replace(R.id.flContainer, fragment)
        transaction?.commit()
    }


}




