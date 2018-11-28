package com.apps.marsellus.baseofapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.marsellus.baseofapp.R;
import com.apps.marsellus.baseofapp.adapter.PhotosRecyclerViewAdapter;
import com.apps.marsellus.baseofapp.objects.PhotoObject;

import java.util.ArrayList;
import java.util.List;

public class TabPhotosFragment extends Fragment {

    View v;
    private RecyclerView rv;
    private List<PhotoObject> photoObjectList;
    private int photo_num = 18;

    public TabPhotosFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.photos_fragment, container, false);
        rv = (RecyclerView) v.findViewById(R.id.photo_list);
        PhotosRecyclerViewAdapter rwa = new PhotosRecyclerViewAdapter(getContext(), photoObjectList);
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        rv.setAdapter(rwa);
        rv.setHasFixedSize(true);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        photoObjectList = new ArrayList<>();
        for (int i = 0; i < photo_num; i++) {
            photoObjectList.add(new PhotoObject(R.mipmap.photo));
        }
    }
}
