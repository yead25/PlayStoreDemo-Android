package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodayAdapter extends RecyclerView.Adapter<TodayAdapter.TodayViewHolder> {

    public ArrayList<Today_item> items;

    public TodayAdapter(ArrayList<Today_item> today_items) {
        items = today_items;
    }

    public class TodayViewHolder extends RecyclerView.ViewHolder {
        public ImageView todayImagview;
        public TextView todayShortText;
        public TextView todayLongText;
        public TextView todayDiscription;


        public TodayViewHolder(@NonNull View itemView) {
            super(itemView);
            todayImagview = itemView.findViewById(R.id.tody_card_image);
            todayShortText = itemView.findViewById(R.id.tody_card_short);
            todayLongText = itemView.findViewById(R.id.tody_card_long);
            todayDiscription = itemView.findViewById(R.id.tody_card_discriptiom);
        }
    }

    @NonNull
    @Override
    public TodayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.today_card, parent, false);
        TodayViewHolder todayViewHolder = new TodayViewHolder(view);
        return todayViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TodayViewHolder holder, int position) {
        Today_item today_item = items.get(position);
        holder.todayImagview.setImageResource(today_item.getImageResource());
        holder.todayShortText.setText(today_item.getShort_text());
        holder.todayLongText.setText(today_item.getLong_text());
        holder.todayDiscription.setText(today_item.getDiscription_text());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
