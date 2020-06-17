package com.example.playstore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Today extends Fragment {

    private TextView date;
    ArrayList<Today_item> arrayList;
    private RecyclerView today_recycler;
    private RecyclerView.Adapter today_adapter;
    private RecyclerView.LayoutManager today_LayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_today,container,false);

        HandleJSON handleJSON = new HandleJSON(getContext());
        arrayList = handleJSON.getTodayItem();

       /* arrayList.add(new Today_item(R.drawable.tom1,"Tom and Jerry 1", "Here is a photo of\nTom and Jerry",
                "Discription of Tom and Jerry, We love them"));
        arrayList.add(new Today_item(R.drawable.tom2,"Tom and Jerry 1", "Here is a photo of\nTom and Jerry",
                "Discription of Tom and Jerry, We love them"));
        arrayList.add(new Today_item(R.drawable.tom3,"Tom and Jerry 1", "Here is a photo of\nTom and Jerry",
                "Discription of Tom and Jerry, We love them"));*/

        today_recycler = v.findViewById(R.id.today_list);
        today_recycler.setHasFixedSize(true);
        today_LayoutManager = new LinearLayoutManager(getContext());
        today_adapter = new TodayAdapter(arrayList);
        today_recycler.setLayoutManager(today_LayoutManager);
        today_recycler.setAdapter(today_adapter);

        date= v.findViewById(R.id.date_view);
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        currentDate= getdate(currentDate).toUpperCase();
        date.setText(currentDate);

        return v;
    }




   private String getdate(String date)
    {
        String ret="";
        int space=0;
        for(int i=0;i<date.length();i++)
        {
            if(date.charAt(i)==' ')space++;
            if(date.charAt(i)==',')continue;
            if(space==3)break;
            ret+=date.charAt(i);
        }
        return ret;
    }
}
