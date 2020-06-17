package com.example.playstore;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.CheckedOutputStream;

public class Games extends Fragment {

    ArrayList<Apps_item> arrayList,arrayList2,arrayList3;
    RecyclerView recyclerView1, recyclerView2, recyclerView3;
    RecyclerView.LayoutManager layoutManager1, layoutManager2,layoutManager3;
    RecyclerView.Adapter adapter1, adapter2,adapter3;
    private GamesListener listener;


    private Button button, button2;

    public interface GamesListener {
        void onGameClick(String input);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_games, container, false);
        button = v.findViewById(R.id.for_you);
        button2 = v.findViewById(R.id.top_chart);

        recyclerView1 = v.findViewById(R.id.for_you_top);
        recyclerView2 = v.findViewById(R.id.for_you_middle);
        recyclerView3 = v.findViewById(R.id.for_you_bottom);

        recyclerView1.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);
        recyclerView3.setHasFixedSize(true);

        layoutManager1 = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        layoutManager2 = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        layoutManager3 = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);

        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView3.setLayoutManager(layoutManager3);
        HandleJSON handleJSON = new HandleJSON(getContext()) ;

        ArrayList<Today_item> arrayList1 = handleJSON.getGameForYou1Item();
        arrayList2 = handleJSON.getGameForYou2Item();
        arrayList3 = handleJSON.getGameForYou3Item();

        /*arrayList.add(new Apps_item(R.drawable.tom1, "Tom and  Jerry 1", 10));
        arrayList.add(new Apps_item(R.drawable.tom2, "Tom and  Jerry 2", 20));
        arrayList.add(new Apps_item(R.drawable.tom3, "Tom and  Jerry 3", 30));
        arrayList.add(new Apps_item(R.drawable.tom1, "Tom and  Jerry 1", 10));
        arrayList.add(new Apps_item(R.drawable.tom2, "Tom and  Jerry 2", 20));
        arrayList.add(new Apps_item(R.drawable.tom3, "Tom and  Jerry 3", 30));
        arrayList.add(new Apps_item(R.drawable.tom1, "Tom and  Jerry 1", 10));
        arrayList.add(new Apps_item(R.drawable.tom2, "Tom and  Jerry 2", 20));
        arrayList.add(new Apps_item(R.drawable.tom3, "Tom and  Jerry 3", 30));*/

        adapter1 = new GameAdapter(arrayList1);
        adapter2 = new AppAdapter(arrayList2);
        adapter3 = new AppAdapter(arrayList3);

        recyclerView1.setAdapter(adapter1);
        recyclerView2.setAdapter(adapter2);
        recyclerView3.setAdapter(adapter3);
        button.setBackgroundColor(getResources().getColor(R.color.Button_change));
        button.setTextColor(getResources().getColor(R.color.text_change));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = "one";
                listener.onGameClick(input);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = "two";
                listener.onGameClick(input);
            }
        });
        return v;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof GamesListener) {
            listener = (GamesListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
