package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> wszystkieProdukty = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wszystkieProdukty.add(new Produkt("niezbadana planeta",200);
        wszystkieProdukty.add(new Produkt("poszukiwanie planety x",100);
        wszystkieProdukty.add(new Produkt("sowy",50);
        wszystkieProdukty.add(new Produkt("maszyna Turinga",120);
        listView = findViewById(R.id.listView2);
        ArrayAdapter<Produkt> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                wszystkieProdukty
        );
        listView.setAdapter(adapter);
    }
}