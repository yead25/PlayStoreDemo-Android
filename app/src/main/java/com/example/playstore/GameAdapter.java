package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {


    ArrayList<Today_item> items;

    public class GameViewHolder extends RecyclerView.ViewHolder {

        ImageView largeImageView;
        ImageView smallImageView;
        TextView small,large,large2;
        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            largeImageView= itemView.findViewById(R.id.big_image);
            smallImageView = itemView.findViewById(R.id.small_image);
            small = itemView.findViewById(R.id.small_text);
            large = itemView.findViewById(R.id.large_text);
            large2 = itemView.findViewById(R.id.large_text2);

        }
    }

    public GameAdapter(ArrayList<Today_item> apps_items) {
        items=apps_items;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_card,parent,false);
        GameViewHolder gameViewHolder = new GameViewHolder(view);
        return gameViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Today_item now = items.get(position);
        holder.largeImageView.setImageResource(now.getImageResource());

        holder.smallImageView.setImageResource(now.getImageResource());
        holder.small.setText(now.getShort_text());
        holder.large.setText(now.getLong_text());
        holder.large2.setText(now.getDiscription_text());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
