package com.apps.marsellus.baseofapp;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class AppSettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);

    }
}
