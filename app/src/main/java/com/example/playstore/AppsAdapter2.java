package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class AppsAdapter2 extends RecyclerView.Adapter<AppsAdapter2.AppViewHolder> {
    public ArrayList<Apps_item> items;

    public class AppViewHolder extends RecyclerView.ViewHolder {

        ImageView appImageView;
        TextView appNameView;
        TextView appSizeView;


        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            appImageView = itemView.findViewById(R.id.apps_card_2_image);
            appNameView = itemView.findViewById(R.id.apps_card_2_name);
            appSizeView = itemView.findViewById(R.id.appS_card_2_size);

        }
    }

    public AppsAdapter2(ArrayList<Apps_item> apps_items) {
        items = apps_items;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.apps_card_2, parent, false);
        AppViewHolder appViewHolder = new AppViewHolder(view);
        return appViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        Apps_item now = items.get(position);
        holder.appImageView.setImageResource(now.getAppImage());
        holder.appNameView.setText(now.getAppName());
        holder.appSizeView.setText("" + now.getAppSize() + "MB");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
