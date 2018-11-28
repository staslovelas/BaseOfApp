package com.apps.marsellus.baseofapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.marsellus.baseofapp.R;
import com.apps.marsellus.baseofapp.objects.ArticleObject;

import java.util.List;

public class ArticlesRecyclerViewAdapter extends RecyclerView.Adapter<ArticlesRecyclerViewAdapter.ArtRecyclerViewHolder> {

    Context appContext;
    List<ArticleObject> articleObjects;

    public ArticlesRecyclerViewAdapter(Context appContext, List<ArticleObject> articleObjects) {
        this.appContext = appContext;
        this.articleObjects = articleObjects;
    }

    @NonNull
    @Override
    public ArtRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(appContext).inflate(R.layout.item_article, viewGroup, false);
        ArtRecyclerViewHolder artRecyclerViewHolder = new ArtRecyclerViewHolder(v);
        return artRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtRecyclerViewHolder artRecyclerViewHolder, int i) {

        artRecyclerViewHolder.art_title.setText(articleObjects.get(i).getTitle());
        artRecyclerViewHolder.art_description.setText(articleObjects.get(i).getDescription());
        artRecyclerViewHolder.art_avatar.setImageResource(articleObjects.get(i).getAvatar());

    }

    @Override
    public int getItemCount() {
        return articleObjects.size();
    }

    public class ArtRecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView art_title;
        private TextView art_description;
        private ImageView art_avatar;

        public ArtRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            art_title = (TextView) itemView.findViewById(R.id.article_title);
            art_description = (TextView) itemView.findViewById(R.id.article_description);
            art_avatar = (ImageView) itemView.findViewById(R.id.article_avatar);
        }
    }
}

