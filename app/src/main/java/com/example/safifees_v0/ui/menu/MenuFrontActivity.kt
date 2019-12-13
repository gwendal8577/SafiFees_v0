package com.example.safifees_v0.ui.menu

import android.os.Bundle
import android.view.Menu
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.ui.navigateUp
import com.example.safifees_v0.R

class MenuFrontActivity() : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu_front)
        val toolbar: Toolbar = findViewById(R.id.toolbar_front)
        setSupportActionBar(toolbar)
        val drawerLayout: DrawerLayout = findViewById(R.id.MenuFrontActivity)
        val navView: NavigationView = findViewById(R.id.nav_view_front)
        val navController = findNavController(R.id.nav_home_front)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home_front,
                R.id.nav_add_fees,
                R.id.nav_sheet_history,
                R.id.nav_sheet_to_proceed,
                R.id.nav_my_profil
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_home_front)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}