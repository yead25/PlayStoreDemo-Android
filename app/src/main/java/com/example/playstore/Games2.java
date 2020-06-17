package com.example.playstore;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Games2 extends Fragment {


    ArrayList<Apps_item> arrayList1,arrayList2,arrayList3;
    RecyclerView recyclerView1, recyclerView2, recyclerView3;
    RecyclerView.Adapter adapter,adapter2,adapter3;
    RecyclerView.LayoutManager layoutManager1, layoutManager2, layoutManager3;


    private Games2Listener listener;


    private Button button, button2;

    public interface Games2Listener {
        void onGame2Click(String input);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_games_2, container, false);
        button = v.findViewById(R.id.for_you);
        button2 = v.findViewById(R.id.top_chart);

        recyclerView1 = v.findViewById(R.id.games_2_rec1);
        recyclerView2 = v.findViewById(R.id.games_2_rec2);
        recyclerView3 = v.findViewById(R.id.games_2_rec3);

        recyclerView1.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);
        recyclerView3.setHasFixedSize(true);

        layoutManager1 = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        layoutManager2 = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        layoutManager3 = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);

        HandleJSON handleJSON = new HandleJSON(getContext());
        arrayList1   = handleJSON.getGameSuggestedItem();
        arrayList2  = handleJSON.getGameNonStopItem();
        arrayList3 = handleJSON.getGameSpotLightItem();
     /* arrayList.add(new Apps_item(R.drawable.tom1,"Tom and  Jerry 1",10 ));
        arrayList.add(new Apps_item(R.drawable.tom2,"Tom and  Jerry 2",20));
        arrayList.add(new Apps_item(R.drawable.tom3,"Tom and  Jerry 3",30 ));
        arrayList.add(new Apps_item(R.drawable.tom1,"Tom and  Jerry 1",10 ));
        arrayList.add(new Apps_item(R.drawable.tom2,"Tom and  Jerry 2",20 ));
        arrayList.add(new Apps_item(R.drawable.tom3,"Tom and  Jerry 3",30 ));
        arrayList.add(new Apps_item(R.drawable.tom1,"Tom and  Jerry 1",10 ));
        arrayList.add(new Apps_item(R.drawable.tom2,"Tom and  Jerry 2",20 ));
        arrayList.add(new Apps_item(R.drawable.tom3,"Tom and  Jerry 3",30 ));*/

        adapter = new AppAdapter(arrayList1);
        adapter2 = new AppAdapter(arrayList2);
        adapter3= new AppAdapter(arrayList3);

        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView3.setLayoutManager(layoutManager3);

        recyclerView1.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);
        recyclerView3.setAdapter(adapter3);

        button2.setBackgroundColor(getResources().getColor(R.color.Button_change));
       button2.setTextColor(getResources().getColor(R.color.text_change));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = "one";
                listener.onGame2Click(input);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = "two";
                listener.onGame2Click(input);
            }
        });
        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Games2Listener) {
            listener = (Games2Listener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
