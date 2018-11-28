package com.apps.marsellus.baseofapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.marsellus.baseofapp.R;
import com.apps.marsellus.baseofapp.objects.ArticleObject;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    Context appContext;
    List<ArticleObject> articleObjects;

    public RecyclerViewAdapter(Context appContext, List<ArticleObject> articleObjects) {
        this.appContext = appContext;
        this.articleObjects = articleObjects;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(appContext).inflate(R.layout.item_articles, viewGroup, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(v);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {

        recyclerViewHolder.art_title.setText(articleObjects.get(i).getTitle());
        recyclerViewHolder.art_description.setText(articleObjects.get(i).getDescription());
        recyclerViewHolder.art_avatar.setImageResource(articleObjects.get(i).getAvatar());

    }

    @Override
    public int getItemCount() {
        return articleObjects.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView art_title;
        private TextView art_description;
        private ImageView art_avatar;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            art_title = (TextView) itemView.findViewById(R.id.article_title);
            art_description = (TextView) itemView.findViewById(R.id.article_description);
            art_avatar = (ImageView) itemView.findViewById(R.id.article_avatar);
        }
    }
}

