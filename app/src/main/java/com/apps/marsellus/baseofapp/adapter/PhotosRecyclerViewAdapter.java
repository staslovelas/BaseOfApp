package com.apps.marsellus.baseofapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.apps.marsellus.baseofapp.R;
import com.apps.marsellus.baseofapp.objects.PhotoObject;

import java.util.List;

public class PhotosRecyclerViewAdapter extends RecyclerView.Adapter<PhotosRecyclerViewAdapter.PhotoRecyclerViewHolder>{

    Context appContext;
    List<PhotoObject> photoObjects;

    public PhotosRecyclerViewAdapter(Context appContext, List<PhotoObject> photoObjects) {
        this.appContext = appContext;
        this.photoObjects = photoObjects;
    }

    @NonNull
    @Override
    public PhotoRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(appContext).inflate(R.layout.item_photo, viewGroup, false);
        PhotosRecyclerViewAdapter.PhotoRecyclerViewHolder pRecyclerViewHolder = new PhotosRecyclerViewAdapter.PhotoRecyclerViewHolder(v);
        return pRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoRecyclerViewHolder photoRecyclerViewHolder, int i) {
        photoRecyclerViewHolder.photo_avatar.setImageResource(photoObjects.get(i).getAvatar());
    }

    @Override
    public int getItemCount() {
        return photoObjects.size();
    }

    public class PhotoRecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView photo_avatar;

        public PhotoRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            photo_avatar = (ImageView) itemView.findViewById(R.id.photo_avatar);
        }
    }
}
