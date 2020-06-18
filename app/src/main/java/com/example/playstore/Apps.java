package com.example.playstore;

import android.os.Bundle;
import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Apps extends Fragment {
    ArrayList<Apps_item> arrayList, arrayList2;
    RecyclerView recyclerView1, recyclerView2;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter1, adapter2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_apps, container, false);

        /*arrayList = new ArrayList<>();
        arrayList.add(new Apps_item(R.drawable.tom1,"Tom and  Jerry 1",10 ));
        arrayList.add(new Apps_item(R.drawable.tom2,"Tom and  Jerry 2",20));
        arrayList.add(new Apps_item(R.drawable.tom3,"Tom and  Jerry 3",30 ));
        arrayList.add(new Apps_item(R.drawable.tom1,"Tom and  Jerry 1",10 ));
        arrayList.add(new Apps_item(R.drawable.tom2,"Tom and  Jerry 2",20 ));
        arrayList.add(new Apps_item(R.drawable.tom3,"Tom and  Jerry 3",30 ));
        arrayList.add(new Apps_item(R.drawable.tom1,"Tom and  Jerry 1",10 ));
        arrayList.add(new Apps_item(R.drawable.tom2,"Tom and  Jerry 2",20 ));
        arrayList.add(new Apps_item(R.drawable.tom3,"Tom and  Jerry 3",30 ));*/

        HandleJSON handleJSON = new HandleJSON(getContext());
        arrayList = handleJSON.getAppSuggestedItem();
        arrayList2 = handleJSON.getAppTopFreeItem();
        recyclerView1 = v.findViewById(R.id.apps_recycler_1);
        recyclerView2 = v.findViewById(R.id.apps_recycler_2);

        recyclerView1.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3, GridLayoutManager.HORIZONTAL, false);
        layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);

        adapter1 = new AppAdapter(arrayList);
        adapter2 = new AppsAdapter2(arrayList2);

        recyclerView1.setLayoutManager(layoutManager);
        recyclerView1.setAdapter(adapter1);


        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setAdapter(adapter2);

        return v;


    }
}
