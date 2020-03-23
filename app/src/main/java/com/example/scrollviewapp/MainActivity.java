package com.example.scrollviewapp;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = findViewById(R.id.swipe);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                final Handler handler = new Handler();
                final Runnable r = new Runnable() {
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                };

                handler.postDelayed(r, 2000);
            }
        });

        Adapter adapter = new Adapter();
        RecyclerView horList = findViewById(R.id.hor_list);
        horList.setAdapter(adapter);

        RecyclerView verList = findViewById(R.id.ver_list);
        verList.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
