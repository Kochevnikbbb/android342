package com.nomad.android342;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        recyclerView = findViewById(R.id.recicle_view);
        names = new ArrayList<>();
        names.add("Bakai");
        names.add("sirena");
        names.add("gulzat");
        names.add("cholpon");
        names.add("alina");
        names.add("minura");
        names.add("shirin");

    }
}