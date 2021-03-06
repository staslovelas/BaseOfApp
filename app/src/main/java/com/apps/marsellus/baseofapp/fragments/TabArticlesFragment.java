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
import com.apps.marsellus.baseofapp.adapter.ArticlesRecyclerViewAdapter;
import com.apps.marsellus.baseofapp.objects.ArticleObject;

import java.util.ArrayList;
import java.util.List;

public class TabArticlesFragment extends Fragment {

    View v;
    private RecyclerView rv;
    private List<ArticleObject> articleObjectList;
    private int art_num = 18;

    public TabArticlesFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.articles_fragment, container, false);
        rv = (RecyclerView) v.findViewById(R.id.articles_list);
        ArticlesRecyclerViewAdapter rwa = new ArticlesRecyclerViewAdapter(getContext(), articleObjectList);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(rwa);
        rv.setHasFixedSize(true);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        articleObjectList = new ArrayList<>();
        for(int i = 0; i<art_num; i++){
            articleObjectList.add(new ArticleObject(getString(R.string.app_name), getString(R.string.first_dialog_text), R.mipmap.ic_launcher_round));
        }
    }
}
