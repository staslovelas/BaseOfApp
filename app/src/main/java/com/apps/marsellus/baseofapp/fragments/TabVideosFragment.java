package com.apps.marsellus.baseofapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.marsellus.baseofapp.R;
import com.apps.marsellus.baseofapp.adapter.VideosRecyclerViewAdapter;
import com.apps.marsellus.baseofapp.objects.VideoObject;

import java.util.ArrayList;
import java.util.List;

public class TabVideosFragment extends Fragment {

    View v;
    private RecyclerView rv;
    private List<VideoObject> videoObjectList;
    private int video_num = 18;

    public TabVideosFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.videos_fragment, container, false);
        rv = (RecyclerView) v.findViewById(R.id.video_list);
        VideosRecyclerViewAdapter rwa = new VideosRecyclerViewAdapter(getContext(), videoObjectList);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(rwa);
        rv.setHasFixedSize(true);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        videoObjectList = new ArrayList<>();
        for (int i = 0; i < video_num; i++) {
            videoObjectList.add(new VideoObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.photo));
        }
    }
}
