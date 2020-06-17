package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder> {
    public ArrayList<Apps_item> items;

    public class AppViewHolder extends RecyclerView.ViewHolder {

        ImageView appImageView;
        TextView appNameView;
        TextView appSizeView;


        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            appImageView = itemView.findViewById(R.id.apps_image);
            appNameView = itemView.findViewById(R.id.apps_name);
            appSizeView = itemView.findViewById(R.id.apps_size);

        }
    }

    public AppAdapter(ArrayList<Apps_item> apps_items) {
        items = apps_items;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.apps_card_1, parent, false);
        AppViewHolder appViewHolder = new AppViewHolder(view);
        return appViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        Apps_item now = items.get(position);
        holder.appImageView.setImageResource(now. getAppImage());
        holder.appNameView.setText(now.getAppName());
        holder.appSizeView.setText(""+now.getAppSize()+"MB");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
