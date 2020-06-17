package com.example.playstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Point;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements Games.GamesListener , Games2.Games2Listener {

    private static String TAG = "here";
    TextView textView;
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemReselectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Today()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemReselectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {


                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()) {
                        case R.id.today:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Today()).commit();
                            break;
                        case R.id.games:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Games()).commit();
                            break;
                        case R.id.apps:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Apps()).commit();
                            break;
                    }

                    return true;
                }
            };


    @Override
    public void onGameClick(String input) {
        if(input=="one") {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Games()).commit();
        }
        else if(input == "two") {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Games2()).commit();
        }



    }

    @Override
    public void onGame2Click(String input) {
        if(input=="one") {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Games()).commit();
        }
        else if(input == "two") {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Games2()).commit();
        }
    }
}
