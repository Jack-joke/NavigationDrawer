package com.example.dell.recyclerview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Human> human;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerHuman);
        human = new ArrayList<>();
        createHuman();
        adapter = new RecyclerViewAdapter(this, human);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createHuman() {
        human.add(new Human("Jenny", R.drawable.iconfinder_4_3561839));
        human.add(new Human("Johnny", R.drawable.iconfinder_4_3561839));
        human.add(new Human("George", R.drawable.iconfinder_4_3561839));
        human.add(new Human("Jacky", R.drawable.shibe01));
        human.add(new Human("Jacky", R.drawable.shibe01));
        human.add(new Human("Jacky", R.drawable.shibe01));
        human.add(new Human("Jacky", R.drawable.shibe01));

    }

}
