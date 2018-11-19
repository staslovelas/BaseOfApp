package com.apps.marsellus.baseofapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabPageFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "page_number";

    public TabPageFragment() {
    }

    public static TabPageFragment newInstance(int pageNumber) {
        Log.d("Fragment", "newInstance done");
        TabPageFragment fragment = new TabPageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("Fragment", "OnCreateView done");
        View view = inflater.inflate(R.layout.tab_fragment_page, container, false);
        TextView textView = (TextView) view.findViewById(R.id.page_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_PAGE_NUMBER)));
        return view;
    }
}
