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
import com.apps.marsellus.baseofapp.adapter.RecyclerViewAdapter;
import com.apps.marsellus.baseofapp.objects.ArticleObject;

import java.util.ArrayList;
import java.util.List;

public class TabArticlesFragment extends Fragment {

    View v;
    private RecyclerView rw;
    private List<ArticleObject> articleObjectList;

    public TabArticlesFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.articles_fragment, container, false);
        rw = (RecyclerView) v.findViewById(R.id.articles_list);
        RecyclerViewAdapter rwa = new RecyclerViewAdapter(getContext(), articleObjectList);
        rw.setLayoutManager(new LinearLayoutManager(getActivity()));
        rw.setAdapter(rwa);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        articleObjectList = new ArrayList<>();
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
    }
}
