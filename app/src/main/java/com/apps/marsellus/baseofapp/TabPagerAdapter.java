package com.apps.marsellus.baseofapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d("Fragment", "getItem done");
        return TabPageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        Log.d("Fragment", "getCount done");
        return 3;
    }
}
