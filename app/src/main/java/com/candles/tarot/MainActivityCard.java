package com.candles.tarot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.candles.tarot.adapter.TarotAdapter;
import com.candles.tarot.model.Tarots;

import java.util.ArrayList;

public class MainActivityCard extends AppCompatActivity {

    GridView _gridview;
    TarotAdapter tarotAdapter;
    ArrayList<Tarots> dsTarots = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card);
        addControls();
        addEvents();
    }

    private void addControls() {
        _gridview = findViewById(R.id.grid_view);
        dsTarots.add(new Tarots("Tarot Card : 01", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 02", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 03", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 04", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 05", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 06", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 07", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 08", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 09", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 10", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 11", R.drawable.tarotpic));
        dsTarots.add(new Tarots("Tarot Card : 12", R.drawable.tarotpic));

        tarotAdapter = new TarotAdapter(MainActivityCard.this,R.layout.item_tarot,dsTarots);
        _gridview.setAdapter(tarotAdapter);
    }

    private void addEvents() {
//      Event gridview (setOnItem)
        _gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivityCard.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}