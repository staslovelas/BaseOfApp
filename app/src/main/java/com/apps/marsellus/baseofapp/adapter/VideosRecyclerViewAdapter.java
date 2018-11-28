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
import com.apps.marsellus.baseofapp.objects.VideoObject;

import java.util.List;

public class VideosRecyclerViewAdapter extends RecyclerView.Adapter<VideosRecyclerViewAdapter.VideoRecyclerViewHolder> {

    Context appContext;
    List<VideoObject> videoObjects;

    public VideosRecyclerViewAdapter(Context appContext, List<VideoObject> videoObjects) {
        this.appContext = appContext;
        this.videoObjects = videoObjects;
    }

    @NonNull
    @Override
    public VideoRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(appContext).inflate(R.layout.item_video, viewGroup, false);
        VideoRecyclerViewHolder videoRecyclerViewHolder = new VideoRecyclerViewHolder(v);
        return videoRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoRecyclerViewHolder videoRecyclerViewHolder, int i) {

        videoRecyclerViewHolder.video_title.setText(videoObjects.get(i).getTitle());
        videoRecyclerViewHolder.video_description.setText(videoObjects.get(i).getDescription());
        videoRecyclerViewHolder.video_avatar.setImageResource(videoObjects.get(i).getAvatar());

    }

    @Override
    public int getItemCount() {
        return videoObjects.size();
    }

    public class VideoRecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView video_title;
        private TextView video_description;
        private ImageView video_avatar;

        public VideoRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            video_title = (TextView) itemView.findViewById(R.id.video_title);
            video_description = (TextView) itemView.findViewById(R.id.video_description);
            video_avatar = (ImageView) itemView.findViewById(R.id.video_avatar);
        }
    }
}
