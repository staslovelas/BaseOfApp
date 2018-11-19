package com.apps.marsellus.baseofapp;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

public class Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private TabPagerAdapter tabPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view_main);
        navigationView.setNavigationItemSelectedListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(tabPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

        Log.d("Main", "onCreate done");
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        AppDialogFragment dialog = new AppDialogFragment();
        Bundle bundle = new Bundle();

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
                bundle.putString("id", getString(R.string.item7));
                bundle.putString("txt", getString(R.string.first_dialog_text));
                dialog.setArguments(bundle);
                dialog.show(getSupportFragmentManager(), "about_dialog");
                break;
            case R.id.menu_item8:
                Toast.makeText(this, getString(R.string.item8), Toast.LENGTH_SHORT).show();
                bundle.putString("id", getString(R.string.item8));
                bundle.putString("txt", getString(R.string.second_dialog_text));
                dialog.setArguments(bundle);
                dialog.show(getSupportFragmentManager(), "feedback_dialog");
                break;
            case R.id.menu_item9:
                Toast.makeText(this, getString(R.string.item9), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, AppSettingsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
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

        MenuItem searchBtn = menu.findItem(R.id.search_btn);
        SearchView searchView = (SearchView) searchBtn.getActionView();

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        if(searchManager!=null){
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        }

        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        Log.d("Main", "onCreateOptionsMenu done");
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
