package com.apps.marsellus.baseofapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText searchLine = toolbar.findViewById(R.id.search_line);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view_main);
        navigationView.setNavigationItemSelectedListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        switch (id) {
            case R.id.menu_item1:
                Toast.makeText(this, getString(R.string.item1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item2:
                Toast.makeText(this, getString(R.string.item2), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item3:
                Toast.makeText(this, getString(R.string.item3), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item4:
                Toast.makeText(this, getString(R.string.item4), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item5:
                Toast.makeText(this, getString(R.string.item5), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item6:
                Toast.makeText(this, getString(R.string.item6), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item7:
                Toast.makeText(this, getString(R.string.item7), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item8:
                Toast.makeText(this, getString(R.string.item8), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item9:
                Toast.makeText(this, getString(R.string.item9), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.search_btn) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
